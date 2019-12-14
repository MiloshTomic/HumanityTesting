package humanity.main;

import java.util.Scanner;


import humanity.testing.VerifyThatLoginPageIsDisplayed;
import humanity.testing.VerifyThatUserIsAbleToAddEmployeeWithAllInput;
import humanity.testing.VerifyThatUserIsAbleToAddEmployeeWithOnlyFirstName;
import humanity.testing.VerifyThatUserIsAbleToLogIn;
import humanity.testing.VerifyThatUserIsAbleToNavigateToAddEmployeePage;
import humanity.testing.VerifyThatUserIsAbleToNavigateToStaffPage;
import humanity.testing.VerifyThatUserIsNotAbleToAddEmployeeWithOnlyEmail;
import humanity.testing.VerifyThatUserIsNotAbleToAddEmployeeWithOnlyLastName;
import humanity.testing.VerifyThatUserIsNotAbleToAddEmployeeWithoutAnyInput;
import humanity.testing.VerifyThatUserIsNotAbleToLogInWithoutEmailPassword;
import humanity.testing.VerifyThatUserIsNotAbleToLoginWihoutUsername;
import humanity.testing.VerifyThatUserIsNotAbleToLoginWithoutPassword;

public class HumanityMain {
	public static final String URL = "http://www.humanity.com";
	private static Scanner citac;
	
	public static void main(String[] args) throws InterruptedException {
	
		
		citac = new Scanner(System.in);
		int i;
		do {
		System.out.println("Choose what do you want to test:");
		System.out.println("1 - Verify that LogIn page is displayed.");
		System.out.println("2 - Verify that user is able to log in.");
		System.out.println("3 - Verify that user is not able to log in without username and password.");
		System.out.println("4 - Verify that user is not able to log in without username.");
		System.out.println("5 - Verify that user is not able to log in without password.");
		System.out.println("6 - Verify that user is able to navigate to Staff page.");
		System.out.println("7 - Verify that user is able to navigate to Add Employee page.");
		System.out.println("8 - Verify that user is not able to add employee without any input.");
		System.out.println("9 - Verify that user is able to add employee with only first name.");
		System.out.println("10 - Verify that user is not able to add employee with only last name.");
		System.out.println("11 - Verify that user is not able to add employee with only email.");
		System.out.println("12 - Verify that user is able to add employee with all input.");
		
		System.out.println();
		System.out.println("0 - For exit.");
		
		i = citac.nextInt();
		switch(i) {
		case 1 : 
			System.out.println("Verify that LogIn page is displayed is starting...");
			VerifyThatLoginPageIsDisplayed.LogInPageTest();
			break;
		case 2: 
			System.out.println("Verify that user is able to log in is starting...");
			VerifyThatUserIsAbleToLogIn.LogInTest();
			break;
		case 3:
			System.out.println("Verify that user is not able to log in without username and password is starting...");
			VerifyThatUserIsNotAbleToLogInWithoutEmailPassword.NoEmailPasswordTest();
			break;
		case 4:
			System.out.println("Verify that user is not able to log in without username is starting...");
			VerifyThatUserIsNotAbleToLoginWihoutUsername.NoUsernameTest();
			break;
		case 5:
			System.out.println("Verify that user is not able to log in without password is starting...");
			VerifyThatUserIsNotAbleToLoginWithoutPassword.NoPasswordTest();
			break;
		case 6:
			System.out.println("Verify that user is able to navigate to Staff page is starting...");
			VerifyThatUserIsAbleToNavigateToStaffPage.StaffPageTest();
			break;
		case 7:
			System.out.println("Verify that user is able to navigate to Add Employee page is starting...");
			VerifyThatUserIsAbleToNavigateToAddEmployeePage.AddNewEmployeePageTest();
			break;
		case 8:
			System.out.println("Verify that user is not able to add employee without any input is starting...");
			VerifyThatUserIsNotAbleToAddEmployeeWithoutAnyInput.NothingAddNewEmployeeTest();
			break;
		case 9:
			System.out.println("Verify that user is able to add employee with only first name is starting...");
			VerifyThatUserIsAbleToAddEmployeeWithOnlyFirstName.OnlyFirstNameNewEmployeeTest();
			break;
		case 10:
			System.out.println("Verify that user is not able to add employee with only last name is starting...");
			VerifyThatUserIsNotAbleToAddEmployeeWithOnlyLastName.OnlyLastNameAddNewEmployeeTest();
			break;
		case 11:
			System.out.println("Verify that user is not able to add employee with only email is starting...");
			VerifyThatUserIsNotAbleToAddEmployeeWithOnlyEmail.OnlyEmailAddNewEmployeeTest();
			break;
		case 12:
			System.out.println("Verify that user is able to add employee with all input is starting...");
			VerifyThatUserIsAbleToAddEmployeeWithAllInput.AllInputAddNewEmployeeTest();
			break;
		case 0:
			System.out.println("EXIT!");
			break;
			default:System.out.println ("!!!!!");
		}

		}while(i!=0);
	}
	
	
}

