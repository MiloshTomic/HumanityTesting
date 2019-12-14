package humanity.testing;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import humanity.page.objects.HumanityHome;

import humanity.page.objects.HumanityStaff;

public class VerifyThatUserIsAbleToAddEmployeeWithAllInput {
	public static void AllInputAddNewEmployeeTest() {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		
		try {
			driver.get(HumanityHome.URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HumanityHome.clickLogIn(driver);
			HumanityHome.clickEmailInLogIn(driver);
			HumanityHome.InputEmailInLogIn(driver, "hocake3071@swift-mail.net");
			HumanityHome.clickPasswordInLogIn(driver);
			HumanityHome.InputPasswordInLogIn(driver, "Testiranje2019" );
			HumanityHome.clickLogInButton(driver);
			
			HumanityStaff.clickStaff(driver);
			HumanityStaff.clickAddEmployees(driver);
			HumanityStaff.InputFirstName(driver, "Borivoje");
			HumanityStaff.InputLastName(driver, "Petrovic");
			HumanityStaff.InputEmail(driver, "asdqweuyt@email.com");
			HumanityStaff.clickSaveEmployee(driver);
			
			List<WebElement> radnik= driver.findElements(By.xpath("//a[contains(text(),'" + "Borivoje Petrovic" + "')]"));
			Assert.assertTrue(radnik.size() > 0, "Employee is added");
		}catch(AssertionError error) {
			Assert.fail();
			System.out.println(error.getMessage());
			
			
		}finally {
			driver.quit();
		}
	}
}
