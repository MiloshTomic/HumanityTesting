package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityHome {
	public static final String URL = "http://www.humanity.com";
	public static final String LOGEDIN_URL = "https://humanet.humanity.com/app/dashboard/";
	public static final String LOG_IN_XPATH = "//p[contains(text(),'LOGIN')]";
	public static final String LOG_IN_URL = "https://www.humanity.com/app/";
	public static final String EMAIL_INLOGIN_XPATH = "//input[@id='email']";// field when you click LogIn
	public static final String PASSWORD_INLOGIN_XPATH = "//input[@id='password']";// field when you click LogIn
	public static final String LOG_IN_BUTTON_XPATH = "//button[contains(text(),'Log in')]";
	public static final String FULL_NAME_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Full Name']";
	public static final String EMAIL_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";

	// LogIn
	public static WebElement getLogIn(WebDriver driver) {
		return driver.findElement(By.xpath(LOG_IN_XPATH));
	}

	public static void clickLogIn(WebDriver driver) {
		getLogIn(driver).click();

	}

	// When you enter LogIn
	// email
	public static WebElement getEmailInLogIn(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_INLOGIN_XPATH));
	}

	public static void clickEmailInLogIn(WebDriver driver) {
		getEmailInLogIn(driver).click();
	}

	public static void InputEmailInLogIn(WebDriver driver, String data) {
		getEmailInLogIn(driver).sendKeys(data);

	}

	// password
	public static WebElement getPasswordInLogIn(WebDriver driver) {
		return driver.findElement(By.xpath(PASSWORD_INLOGIN_XPATH));
	}

	public static void clickPasswordInLogIn(WebDriver driver) {
		getPasswordInLogIn(driver).click();
	}

	public static void InputPasswordInLogIn(WebDriver driver, String data) {
		getPasswordInLogIn(driver).sendKeys(data);

	}

	// LogInButton
	public static WebElement getLogInButton(WebDriver driver) {
		return driver.findElement(By.xpath(LOG_IN_BUTTON_XPATH));
	}

	public static void clickLogInButton(WebDriver driver) {
		getLogInButton(driver).click();
	}

	// Email

	public static WebElement getEmailOnPage(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));
	}

	public static void clickEmailOnPage(WebDriver driver) {
		getEmailOnPage(driver).click();
	}

	public static void InputEmailOnPage(WebDriver driver, String data) {
		getEmailOnPage(driver).sendKeys(data);

	}

}