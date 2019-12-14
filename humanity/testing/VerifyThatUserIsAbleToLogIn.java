package humanity.testing;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import humanity.page.objects.HumanityHome;



public class VerifyThatUserIsAbleToLogIn {
	public static void LogInTest( ) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		
		try {
			driver.get(HumanityHome.URL);
			driver.manage().window().fullscreen();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HumanityHome.clickLogIn(driver);
			HumanityHome.clickEmailInLogIn(driver);
			HumanityHome.InputEmailInLogIn(driver, "hocake3071@swift-mail.net");
			HumanityHome.clickPasswordInLogIn(driver);
			HumanityHome.InputPasswordInLogIn(driver, "Testiranje2019" );
			HumanityHome.clickLogInButton(driver);
			Thread.sleep(3000);
			if (driver.getCurrentUrl().equals("https://testiranje2.humanity.com/app/dashboard/")){
				System.out.println("User is able to log in.");
			}else {
				System.out.println("Error");
			}
			Thread.sleep(3000);
			driver.quit();

			
	}catch(Exception e){
		
		System.out.println(e.toString());
	}
		
	}
}

