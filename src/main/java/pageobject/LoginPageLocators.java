package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPageLocators {
    public LoginPageLocators(WebDriver driver) {
        this.driver = driver;
    }
    private final WebDriver driver;

    // Локатор кнопки войти
    private final By loginEnterButton = By.xpath("//div/main/div/form/button");

    // Локатор кнопки регистрация
    private final By registerButton = By.xpath(".//a[@class = 'Auth_link__1fOlj']");

    // Локатор кнопки восстановить пароль
    private final By resetPasswordButton = By.xpath(".//a[@class = 'Auth_link__1fOlj']");

    // Локатор текста "Вход"
    private final By entryText = By.xpath("//div/main/div/h2");

    public void clickLoginEnterButton() {
        driver.findElement(loginEnterButton).click();
    }
    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }
    public void clickResetPasswordButton() {
        driver.findElement(resetPasswordButton).click();
    }
    public void findEntryText() {
        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(entryText));
    }
}
