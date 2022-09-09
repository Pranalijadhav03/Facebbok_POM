package com.fpm.qa.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fpm.qa.base.TestBase;
import com.fpm.qa.pages.HomePage;
import com.fpm.qa.pages.LoginPage;
import com.fpm.qa.pages.ProfilePage;

public class ProfilePageTest extends ProfilePage {
	
	public ProfilePageTest(){
		super();
	}
	
	@BeforeMethod
    public void setUp(){
        setProperties();
        
    }
	 @BeforeMethod
	    public void setUpHomePage(){	
	 setProperties();
     driver.get("https://www.facebook.com/?sk=welcome");
     driver.findElement(By.name("email")).sendKeys("jadhav.pranali2403@gmail.com");
     driver.findElement(By.name("pass")).sendKeys("Pranalij@2403");
     driver.findElement(By.name("login")).click();
     driver.findElement(By.xpath("//span[contains(text(),'Pranali Jadhav')]")).click();
     
	 } 
	 
	 public void setProperties(){
	        System.setProperty("webdriver.chrome.driver",  "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	 }
	 
 @Test(priority = 1)
 public void verifyPostsFieldForProfilePage(){
     String postField = verifyPostsField();
     Assert.assertEquals(postField,"//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y d1w2l3lo'][normalize-space()='Posts']");
 }
 @Test(priority = 2)
 public void verifyAboutFieldLogoInProfilePage(){
     String aboutField  = verifyAboutField();
     Assert.assertEquals(aboutField,"//span[normalize-space()='About']");
 }
 @Test(priority = 3)
 public void verifyMoreFieldForProfilePage(){
     String moreField = verifyMoreField();
     Assert.assertEquals(moreField,"//span[normalize-space()='More']");
 }
 @Test(priority = 4)
 public void verifyFriendsFieldOfProfilePage(){
     String friendField = verifyFriendsField();
     Assert.assertEquals(friendField,"//span[normalize-space()='Friends']");
 }
 @Test(priority = 5)
 public void verifyPhotosFieldOfPage(){
     String photosField = verifyPhotosField();
     Assert.assertEquals(photosField,"//span[contains(text(),'Photos')]");
 }
 @Test(priority = 6)
 public void verifyvideosFieldOfPage(){
     String videosField = verifyVideosField();
     Assert.assertEquals(videosField,"//span[contains(text(),'Videos')]");
 }
 @Test(priority = 7)
 public void verifyCheck_InFieldOfPage(){
     String checkInField = verifyCheck_InField();
     Assert.assertEquals(checkInField,"//span[normalize-space()='Check-ins']");
 }
 @Test(priority = 8)
 public void verifyAddBioFieldOfPage(){
     String addBioField = verifyAddBioField();
     Assert.assertEquals(addBioField,"//div[@aria-label='Add Bio']//div[@class='i85zmo3j alzwoclg jcxyg2ei dkyav5mx mw5ieb4x is65gj9g']");
 }
 @Test(priority = 9)
 public void verifyEditDetailsFieldOfProfilePage(){
     String editDetailsOfField = verifyEditDetailsField();
     Assert.assertEquals(editDetailsOfField,"//span[contains(text(),'Edit details')]");
 }
 @Test(priority = 10)
 public void verifyAddHobbiesFieldOfHomePage(){
     String addHobbiesField = verifyAddHobbiesDetailsField();
     Assert.assertEquals(addHobbiesField,"//div[@aria-label='Add Hobbies']//div[@class='om3e55n1 g4tp4svg alzwoclg jez8cy9q jcxyg2ei i85zmo3j sr926ui1 jl2a5g8c k7n6ui8p b41d885q hmqrhxox got7tec9 frfouenu bonavkto djs4p424 r7bn319e bdao358l aesu6q9g e4ay1f3w a5wdgl2o ed17d2qt']");
 }
	
	 		
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
