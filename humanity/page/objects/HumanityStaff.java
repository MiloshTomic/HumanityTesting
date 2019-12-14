package humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	public static final String STAFF_XPATH = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	public static final String STAFFURL = "https://humanet.humanity.com/app/staff/list/load/true/";
	public static final String ADDEMPLOYEES_XPATH = "//button[@id='act_primary']";
	public static final String FIRSTNAME_XPATH = "//input[@id='_asf1']";
	public static final String LASTNAME_XPATH = "//input[@id='_asl1']";
	public static final String EMAIL_XPATH = "//input[@id='_ase1']";
	public static final String FIRSTNAME_XPATH_SECOND = "//input[@id='_asf2']";
	public static final String LASTNAME_XPATH_SECOND = "//input[@id='_asl2']";
	public static final String EMAIL_XPATH_SECOND = "//input[@id='_ase2']";
	public static final String STARTOFXPATH = "//a[contains(text(),'";
	public static final String ENDOFXPATH_XPATH = "')]";
	public static final String SAVEEMPLOYEE_XPATH = "//button[@id='_as_save_multiple']";

//AddEmployees
	public static WebElement getAddEmployees(WebDriver driver) {
		return driver.findElement(By.xpath(ADDEMPLOYEES_XPATH));
	}

	public static void clickAddEmployees(WebDriver driver) {
		getAddEmployees(driver).click();
	}

	// first name
	public static WebElement getFirstName(WebDriver driver) {
		return driver.findElement(By.xpath(FIRSTNAME_XPATH));

	}

	public static void clickFirstName(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void InputFirstName(WebDriver driver, String data) {
		getFirstName(driver).sendKeys(data);

	}

	// LastName
	public static WebElement getLastName(WebDriver driver) {
		return driver.findElement(By.xpath(LASTNAME_XPATH));
	}

	public static void clickLastName(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void InputLastName(WebDriver driver, String data) {
		getLastName(driver).sendKeys(data);
	}

	// Email
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH));

	}

	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void InputEmail(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

	// first name second
	public static WebElement getFirstNameSecond(WebDriver driver) {
		return driver.findElement(By.xpath(FIRSTNAME_XPATH_SECOND));

	}

	public static void clickFirstNameSecond(WebDriver driver) {
		getFirstName(driver).click();
	}

	public static void InputFirstNameSecond(WebDriver driver, String data) {
		getFirstName(driver).sendKeys(data);

	}

	// LastName Second
	public static WebElement getLastNameSecond(WebDriver driver) {
		return driver.findElement(By.xpath(LASTNAME_XPATH_SECOND));
	}

	public static void clickLastNameSecond(WebDriver driver) {
		getLastName(driver).click();
	}

	public static void InputLastNameSecond(WebDriver driver, String data) {
		getLastName(driver).sendKeys(data);
	}

	// Email Second
	public static WebElement getEmailSecond(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL_XPATH_SECOND));

	}

	public static void clickEmailSecond(WebDriver driver) {
		getEmail(driver).click();
	}

	public static void InputEmailSecond(WebDriver driver, String data) {
		getEmail(driver).sendKeys(data);
	}

// Staff
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));

	}

	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}
//List Of Employees

	public static WebElement getEmployee(WebDriver driver, String Name) {

		return driver.findElement(By.xpath(STARTOFXPATH + Name + ENDOFXPATH_XPATH));

	}

	public static void clickEmployee(WebDriver driver, String Name) {
		getEmployee(driver, Name).click();
	}

//Save Employee

	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVEEMPLOYEE_XPATH));

	}

	public static void clickSaveEmployee(WebDriver driver) {
		getSaveEmployee(driver).click();
	}

}
