package mobilrtesting;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import bsh.Capabilities;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.internal.CapabilityHelpers;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;



public class Banjararide {
	ExtentReports extent;
	ExtentTest logger;
    AndroidDriver<WebElement> driver;
		
 @BeforeTest 
	public void Rider() throws MalformedURLException {
			
			 DesiredCapabilities dc=new DesiredCapabilities();
			 dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
			 dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
			 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
			 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.forbinary.banjararide");
			 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.forbinary.banjararide.activity.SplashActivity");
			 driver =new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	
	extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/sourabh.html",true);
		
  extent.loadConfig(new File(System.getProperty("user.dir")+"src/test/java/extent-config.xml"));// try to load config. on src/test/java
		  
	}
		@Test
		
       public void Login() throws MalformedURLException, InterruptedException {

	  logger=extent.startTest("Bangara Ride");//this indicates that logger will have a influence on the test
	 // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@text='ENGLISH']")).click();
	  logger.log(LogStatus.PASS, "Language Selected");
	  
	/*  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imageView_arrow")).click();
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@text='Search...']")).sendKeys("Ind");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//*[@text='India (IN)']")).click();
	  
	//  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India (IN)\"))").click();
	  logger.log(LogStatus.PASS, "Country Seleted");
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@text='Enter your mobile number']")).sendKeys("9758709057");
	  logger.log(LogStatus.PASS, "Mobile Number Accepted");
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/imgNext")).click();
	  logger.log(LogStatus.PASS, "Navigate To HomePage");
	  
	  
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElements(MobileBy.id("com.forbinary.banjararide:id/edtInputProfile")).get(0).sendKeys("sourabh");
	  logger.log(LogStatus.PASS, "Name Entered ");
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElements(MobileBy.id("com.forbinary.banjararide:id/edtInputProfile")).get(1).sendKeys("mailatsourabh@gmail.com");
	  logger.log(LogStatus.PASS, "EmailId Entered");
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElements(MobileBy.id("com.forbinary.banjararide:id/edtInputProfile")).get(2).sendKeys("Delhi NCR");
	  logger.log(LogStatus.PASS, "Address Entered");
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElements(MobileBy.id("com.forbinary.banjararide:id/edtInputProfile")).get(3).sendKeys("466030140160");
	  logger.log(LogStatus.PASS, "AadharNumber Entered");
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElements(MobileBy.id("com.forbinary.banjararide:id/edtInputProfile")).get(4).sendKeys("9758709057");
	  logger.log(LogStatus.PASS, "MobileNumber Entered");
	  
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@text='SUBMIT']")).click();
	  logger.log(LogStatus.PASS, "Submit Successfully");
  
	  //Book Now In HomePage
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@text='BOOK NOW']")).click();
	  logger.log(LogStatus.PASS, "Book Now Is Selected");
	  //Hire Bike
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@text='Hire Bike']")).click();
	  logger.log(LogStatus.PASS, "HireBike IS Selected");
	  //Select The Bike CB Hornet 160
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@text='CB Hornet 160R']")).click();
	  logger.log(LogStatus.PASS, "Bike Is Selected");
	  

	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@text='Book Now']")).click();
	  logger.log(LogStatus.PASS, "Book Now Is Selected");
	  //Click The Calendar
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/llDateContainer")).click();
	  logger.log(LogStatus.PASS, "Calendar Is Selected");
	  //Click The Arrow In The Calendar It Move To Next Month
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(MobileBy.AccessibilityId("Next month")).click();
	  logger.log(LogStatus.PASS, "Change To Next Month Is Done");
	  //Click The Date 1
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@text='1']")).click();
	  logger.log(LogStatus.PASS, "FEB 1 Is Selected");
	  //And Click OK
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@text='OK']")).click();
	  logger.log(LogStatus.PASS, "Click OK ");  
	  //Navigate To HomePage
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.navigate().back();
	  Thread.sleep(1000);
	  driver.navigate().back(); 
	  logger.log(LogStatus.PASS, "Go Back To HomePage");
	  
  
	  //Open left Top Menu
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  driver.findElement(MobileBy.AccessibilityId("Open")).click();
	  logger.log(LogStatus.PASS, "Side Menu Will Open"); 
	  //Click Bookings
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@text='Bookings']")).click();
	  logger.log(LogStatus.PASS, "Bookings Selected");
	  //Click The Search Icon
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.findElement(MobileBy.id("com.forbinary.banjararide:id/search_button")).click();
	  logger.log(LogStatus.PASS, "SearchIcon Selected");
	  //Click The Search Bar And Type Activa
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(By.xpath("//*[@text='Search']")).sendKeys("Activa");
	  logger.log(LogStatus.PASS, "Activa Scooter Is Displayed");  
	  //
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‎‏‏‎‎‏‏‎‎‏‏‏‎‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‏‎‏‎‎‏‎‎‎‎‏‎‎‎‏‏‎‏‏‏‏‎‎‎‎‎‎‎‎‎‎‏‎‎‏‎Clear query‎‏‎‎‏‎\"]")).click();
	  Thread.sleep(2000);
	  driver.findElement(MobileBy.xpath("//android.widget.ImageView[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‏‎‏‏‎‎‏‏‎‎‏‏‏‎‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‏‎‏‎‎‏‎‎‎‎‏‎‎‎‏‏‎‏‏‏‏‎‎‎‎‎‎‎‎‎‎‏‎‎‏‎Clear query‎‏‎‎‏‎\"]")).click();
	  logger.log(LogStatus.PASS, "Pressed 'X' Successfully");
	  //Click The Search Icon
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElement(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎\"]")).click();
	  logger.log(LogStatus.PASS, "Go Back To Home Page");
  
	//ScrollDown and Click The Call Us
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Call Us\"))").click();
	  logger.log(LogStatus.PASS, "Clicking Call Us");
	  
	  Thread.sleep(5000);
	  driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));
	  Thread.sleep(2000);
	  driver.pressKey(new KeyEvent(AndroidKey.APP_SWITCH));*/
	  
	    
  }
  
	 @AfterTest
	 public void End() throws InterruptedException {
		 
	 
	  extent.endTest(logger);// end the logger functions
	  extent.flush();//it will flush the all logger data on html report
	  extent.close();// it will give end to the reports
	  Thread.sleep(5000);
	  driver.closeApp();
	 }
}

