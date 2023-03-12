package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPageLocators {

    public RegisterPageLocators(WebDriver driver) {

        this.driver = driver;
    }
    private final WebDriver driver;

    // Локатор кнопки войти в форме регистрации
    private final By registerLoginButton = By.xpath(".//a[@class = 'Auth_link__1fOlj']");
    // Локатор поля имя
    private final By registerNameField = By.xpath(".//label[text() = 'Имя']/../input[contains(@name, 'name')]");

    // Локатор поля email
    private final By registerEmailField = By.xpath(".//label[text() = 'Email']/../input[contains(@name, 'name')]");

    // Локатор поля password
    private final By registerPasswordField = By.xpath(".//label[text() = 'Пароль']/../input[contains(@type, 'password')]");

    // Локатор кнопки "зарегистрироваться"
    private final By signUpButton = By.xpath(".//button[@class = 'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa' and (text() = 'Зарегистрироваться')]");

    // Локатор текста Некорректный пароль
    private final By incorrectPassText = By.xpath("//p[contains(text(), 'Некорректный пароль')]");

    public void clickRegisterLoginButton() {
        driver.findElement(registerLoginButton).click();
    }
    public void sendRegisterNameField(String name) {
        driver.findElement(registerNameField).sendKeys(name);
    }
    public void sendRegisterEmailField(String email) {
        driver.findElement(registerEmailField).sendKeys(email);
    }
    public void sendRegisterPasswordField(String password) {
        driver.findElement(registerPasswordField).sendKeys(password);
    }

    public void clickSignUpButton() {
        driver.findElement(signUpButton).click();
    }
    public void findIncorrectPassText() {
        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(incorrectPassText));
    }

}
