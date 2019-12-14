package humanity.testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import humanity.page.objects.HumanityHome;


public class VerifyThatUserIsNotAbleToLoginWithoutPassword {
	public static void NoPasswordTest( ) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		
		try {
			driver.get(HumanityHome.URL);
			driver.manage().window().fullscreen();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HumanityHome.clickLogIn(driver);
			HumanityHome.clickEmailInLogIn(driver);
			HumanityHome.InputEmailInLogIn(driver, "hocake3071@swift-mail.net");
			HumanityHome.clickLogInButton(driver);
			Thread.sleep(3000);
			if (driver.getCurrentUrl().equals("https://www.humanity.com/app/")){
				System.out.println("User is not able to log in without password.");
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

