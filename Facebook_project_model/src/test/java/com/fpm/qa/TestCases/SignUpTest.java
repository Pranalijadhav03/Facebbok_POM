package com.fpm.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fpm.qa.base.TestBase;
import com.fpm.qa.pages.HomePage;
import com.fpm.qa.pages.LoginPage;
import com.fpm.qa.pages.SignUpPage;

public class SignUpTest extends SignUpPage {
	public SignUpTest(){
		super();
	}
	
	 @BeforeMethod
	    public void setUp(){
	        setProperties();
	        driver.get("https://www.facebook.com/reg/");
	    }
	 
		 
	    @Test(priority = 1)
	    public void verifyFirstNameOfSignUpPage(){
	        String Name1 = verifyFirstNameField();
	        Assert.assertEquals(Name1,"firstname");
	    }
	    @Test(priority = 2)
	    public void verifyLastNameOfSignUpPage(){
	        String Name2 = verifyLastNameField();
	        Assert.assertEquals(Name2,"lastname");
	    }
	    @Test(priority = 3)
	    public void verifyEmailFieldOfSignUpPage(){
	        String email = verifyEmailTextField();
	        Assert.assertEquals(email,"reg_email__");
	    }
	    @Test(priority = 4)
	    public void verifyConfirmEmailFieldOfSignUpPage(){
	        String confEmail = verifyConfirmEmailTextField();
	        Assert.assertEquals(confEmail,"reg_email_confirmation__");
	    }
	    @Test(priority = 5)
	    public void verifypassFieldOfSignUpPage(){
	        String pass = verifyPasswordTextField();
	        Assert.assertEquals(pass,"reg_passwd__");
	    }
	    @Test(priority = 6)
	    public void verifyBirthDayFieldOfSignUpPage(){
	        String birth_Day = verifyBirthDayField();
	        Assert.assertEquals(birth_Day,"birthday_day");
	    }
	    @Test(priority = 7)
	    public void verifyBirthMonthFieldOfSignUpPage(){
	        String birth_Month = verifyBirthmonthField();
	        Assert.assertEquals(birth_Month,"birthday_month");
	    }
	    @Test(priority = 8)
	    public void verifyBirthYearFieldOfSignUpPage(){
	        String birth_Year = verifyBirthYearField();
	        Assert.assertEquals(birth_Year,"birthday_year");
	    }
	    @Test(priority = 9)
	    public void verifyGenderFieldOfSignUpPage(){
	        String gender = verifyGenderField();
	        Assert.assertEquals(gender,"sex");
	    }
	    @Test(priority = 10)
	    public void verifySubmitbtnOfSignUpPage(){
	        String subBtn = verifySignUpBtnField();
	        Assert.assertEquals(subBtn,"websubmit");
	    }
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
