package humanity.testing;


import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import humanity.page.objects.HumanityHome;
import humanity.page.objects.HumanityStaff;


public class VerifyThatUserIsNotAbleToAddEmployeeWithOnlyLastName {
	public static void OnlyLastNameAddNewEmployeeTest() throws InterruptedException {
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
			HumanityStaff.InputLastName(driver, "Petrovic");
			
			HumanityStaff.clickSaveEmployee(driver);
			
			Thread.sleep(3000);
			
			if (driver.getCurrentUrl().equals("https://testiranje2.humanity.com/app/staff/add/")){
				System.out.println("User is not able to add employee with only last name.");
			}else {
				System.out.println("Error");
			}
		}catch(AssertionError error) {
			Assert.fail();
			System.out.println(error.getMessage());
			
			
		}finally {
			driver.quit();
		}
	}
}
