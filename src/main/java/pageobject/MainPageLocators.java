package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPageLocators {
    public MainPageLocators(WebDriver driver) {
        this.driver = driver;
    }
    private final WebDriver driver;

    // Локатор кнопки Конструктор
    private final By constructorButton = By.xpath(".//p[@class = 'AppHeader_header__linkText__3q_va ml-2' and (text() = 'Конструктор')]");

    // Локатор конструктора булки
    private final By bunButton = By.xpath("//div/main/section[1]/div[1]/div[1]");

    // Локатор конструктора соусы
    private final By sauceButton = By.xpath("//div/main/section[1]/div[1]/div[2]");

    // Локатор конструктора начинки
    private final By fillingButton = By.xpath("//div/main/section[1]/div[1]/div[3]");

    // Локатор текста булки
    private final By bunText = By.xpath("//p[contains(text(), 'Краторная булка N-200i')]");

    // Локатор выбранного меню в конструкторе
    private static final By currentMenu = By.xpath("//div[contains(@class,'tab_tab__1SPyG tab_tab_type_current__2BEPc')]");

//    // Локатор текста соуса
//    private final By sauceText = By.xpath("//p[contains(text(), 'Соус фирменный Space Sauce')]");
//
//    // Локатор текста начинки
//    private final By fillingText = By.xpath("//p[contains(text(), 'Мясо бессмертных моллюсков Protostomia')]");

    // Локатор кнопки войти в аккаунт на главной странице
    private final By mainPageLoginButton = By.xpath(".//button[@class = 'button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_large__G21Vg' " +
            "and (text() = 'Войти в аккаунт')]");

    // Локатор кнопки личный кабинет
    private final By profileButton = By.xpath(".//p[@class = 'AppHeader_header__linkText__3q_va ml-2' and (text() = 'Личный Кабинет')]");

    // Локатор логотипа Stellar Burgers
    private final By logoButton = By.xpath(".//div[@class = 'AppHeader_header__logo__2D0X2']");

    public void clickConstructorButton() {
        driver.findElement(constructorButton).click();

    }
    public void clickBunButton() {
        driver.findElement(bunButton).click();
    }
    public void clickSauceButton() {
        driver.findElement(sauceButton).click();
    }
    public void clickFillingButton() {
        new WebDriverWait(driver, 5).until(ExpectedConditions.elementToBeClickable(fillingButton)).click();

    }
    public void findBunText() {
        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(bunText));

    }
//    public void findSauceText() {
//        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(sauceText));
//
//    }
//    public void findFillingText() {
//        new WebDriverWait(driver, 5).until(ExpectedConditions.presenceOfElementLocated(fillingText));
//
//    }
    public void clickMainPageLoginButton() {
        driver.findElement(mainPageLoginButton).click();
    }
    public void clickProfileButton() {
        driver.findElement(profileButton).click();
    }
    public void clickLogoButton() {
        driver.findElement(logoButton).click();
    }
    public String getTextFromSelectedMenu() {
        return driver.findElement(currentMenu).getText();
    }
}
