import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import pageobject.LoginPageLocators;
import pageobject.MainPageLocators;
import pageobject.ProfilePageLocators;
import pageobject.RegisterPageLocators;

import static org.junit.Assert.assertEquals;
import static config.Configuration.*;

public class TransitionTests extends TestBase{


    @Test
    @DisplayName("Переход в личный кабинет по клику на «Личный кабинет»")
    public void transitionToProfileTest() {
        LoginPageLocators loginPageLocators = new LoginPageLocators(driver);
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        ProfilePageLocators profilePageLocators = new ProfilePageLocators(driver);
        RegisterPageLocators registerPageLocators = new RegisterPageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickProfileButton();
        registerPageLocators.sendRegisterEmailField(loginEmail);
        registerPageLocators.sendRegisterPasswordField(password);
        loginPageLocators.clickLoginEnterButton();
        mainPageLocators.clickProfileButton();
        profilePageLocators.findAccountText();

    }
    @Test
    @DisplayName("Переход из личного кабинета в конструктор по клику на «Конструктор»")
    public void transitionToConstructorByConstructorTest() {
        LoginPageLocators loginPageLocators = new LoginPageLocators(driver);
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        RegisterPageLocators registerPageLocators = new RegisterPageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickProfileButton();
        registerPageLocators.sendRegisterEmailField(loginEmail);
        registerPageLocators.sendRegisterPasswordField(password);
        loginPageLocators.clickLoginEnterButton();
        mainPageLocators.clickConstructorButton();
        mainPageLocators.findBunText();

    }
    @Test
    @DisplayName("Переход из личного кабинета в конструктор по клику на лого")
    public void transitionToConstructorByLogoTest() {
        LoginPageLocators loginPageLocators = new LoginPageLocators(driver);
        MainPageLocators mainPageLocators = new MainPageLocators(driver);
        RegisterPageLocators registerPageLocators = new RegisterPageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickProfileButton();
        registerPageLocators.sendRegisterEmailField(loginEmail);
        registerPageLocators.sendRegisterPasswordField(password);
        loginPageLocators.clickLoginEnterButton();
        mainPageLocators.clickLogoButton();
        mainPageLocators.findBunText();


    }
    @Test
    @DisplayName("Переход по разделам конструктора. Булки")
    public void transitionToBunTest() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickFillingButton();
        mainPageLocators.clickBunButton();
        mainPageLocators.findBunText();
    }
    @Test
    @DisplayName("Переход по разделам конструктора. Соусы")
    public void transitionToSauceTest() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickSauceButton();
        mainPageLocators.findSauceText();


    }
    @Test
    @DisplayName("Переход по разделам конструктора. Начинка")
    public void transitionToFillingTest() {
        MainPageLocators mainPageLocators = new MainPageLocators(driver);

        driver.get(baseUrl);
        mainPageLocators.clickFillingButton();
        mainPageLocators.findFillingText();
    }

}
