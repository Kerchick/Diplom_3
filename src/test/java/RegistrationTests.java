import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPageLocators;
import pageobject.MainPageLocators;
import pageobject.RegisterPageLocators;

import static config.Configuration.*;


public class RegistrationTests extends TestBase{


    @Test
    @DisplayName("Успешная регистрация пользователя в системе")
    public void userRegistrationTest() {
        RegisterPageLocators registerPageLocators = new RegisterPageLocators(driver);
        LoginPageLocators loginPageLocators = new LoginPageLocators(driver);
        MainPageLocators mainPageLocators = new MainPageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickMainPageLoginButton();
        loginPageLocators.clickRegisterButton();
        registerPageLocators.sendRegisterNameField(name);
        registerPageLocators.sendRegisterEmailField(registerEmail);
        registerPageLocators.sendRegisterPasswordField(password);
        registerPageLocators.clickSignUpButton();
        loginPageLocators.findEntryText();
    }

    @Test
    @DisplayName("Установка короткого пароля")
    public void badPasswordTest() {
        RegisterPageLocators registerPageLocators = new RegisterPageLocators(driver);
        LoginPageLocators loginPageLocators = new LoginPageLocators(driver);
        MainPageLocators mainPageLocators = new MainPageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickMainPageLoginButton();
        loginPageLocators.clickRegisterButton();
        registerPageLocators.sendRegisterNameField(name);
        registerPageLocators.sendRegisterEmailField(registerEmail);
        registerPageLocators.sendRegisterPasswordField(incorrectPassword);
        registerPageLocators.clickSignUpButton();
        registerPageLocators.findIncorrectPassText();
    }
}
