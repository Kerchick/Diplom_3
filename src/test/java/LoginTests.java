import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.*;

import static config.Configuration.*;

public class LoginTests extends TestBase{

    @Test
    @DisplayName("Вход по кнопке «Войти в аккаунт» на главной")
    public void loginMainPageTest() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        RegisterPageLocators registerPageLocators = new RegisterPageLocators(driver);
        LoginPageLocators loginPageLocators = new LoginPageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickMainPageLoginButton();
        registerPageLocators.sendRegisterEmailField(loginEmail);
        registerPageLocators.sendRegisterPasswordField(password);
        loginPageLocators.clickLoginEnterButton();
        mainPageLocators.findBunText();

    }
    @Test
    @DisplayName("Вход через кнопку «Личный кабинет»")
    public void loginProfileTest() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        RegisterPageLocators registerPageLocators = new RegisterPageLocators(driver);
        LoginPageLocators loginPageLocators = new LoginPageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickProfileButton();
        registerPageLocators.sendRegisterEmailField(loginEmail);
        registerPageLocators.sendRegisterPasswordField(password);
        loginPageLocators.clickLoginEnterButton();
        mainPageLocators.findBunText();

    }
    @Test
    @DisplayName("Вход через кнопку в форме регистрации")
    public void loginRegisterTest() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        RegisterPageLocators registerPageLocators = new RegisterPageLocators(driver);
        LoginPageLocators loginPageLocators = new LoginPageLocators(driver);
        ForgotPassPageLocators forgotPassPageLocators = new ForgotPassPageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickProfileButton();
        forgotPassPageLocators.clickForgotPassLoginButton();
        registerPageLocators.clickRegisterLoginButton();
        registerPageLocators.sendRegisterEmailField(loginEmail);
        registerPageLocators.sendRegisterPasswordField(password);
        loginPageLocators.clickLoginEnterButton();
        mainPageLocators.findBunText();

    }
    @Test
    @DisplayName("Вход через кнопку в форме восстановления пароля")
    public void loginResetPasswordTest() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        RegisterPageLocators registerPageLocators = new RegisterPageLocators(driver);
        LoginPageLocators loginPageLocators = new LoginPageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickProfileButton();
        loginPageLocators.clickResetPasswordButton();
        registerPageLocators.clickRegisterLoginButton();
        registerPageLocators.sendRegisterEmailField(loginEmail);
        registerPageLocators.sendRegisterPasswordField(password);
        loginPageLocators.clickLoginEnterButton();
        mainPageLocators.findBunText();


    }
    @Test
    @DisplayName("Выход из аккаунта")
    public void logoutTest() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        RegisterPageLocators registerPageLocators = new RegisterPageLocators(driver);
        LoginPageLocators loginPageLocators = new LoginPageLocators(driver);
        ProfilePageLocators profilePageLocators = new ProfilePageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickMainPageLoginButton();
        registerPageLocators.sendRegisterEmailField(loginEmail);
        registerPageLocators.sendRegisterPasswordField(password);
        loginPageLocators.clickLoginEnterButton();
        mainPageLocators.clickProfileButton();
        profilePageLocators.clickLogoutButton();
        loginPageLocators.findEntryText();

    }

}
