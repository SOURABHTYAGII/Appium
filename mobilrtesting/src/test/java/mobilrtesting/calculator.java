package mobilrtesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class calculator {
	AndroidDriver<WebElement> driver;
	private Object action;
	 @BeforeTest
	 public void beforeTest() throws MalformedURLException {
	 DesiredCapabilities dc=new DesiredCapabilities();
	 dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
	 dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
	 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
	 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
	 driver =new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	 }
	 @Test
	 public void Check_1() throws InterruptedException {
	 System.out.println("first native automation");
	 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_7")).click();
	 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_6")).click();
	 driver.findElement(MobileBy.AccessibilityId("plus")).click();
	 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_2")).click();
	 driver.findElement(MobileBy.id("com.android.calculator2:id/digit_8")).click();
	 driver.findElement(MobileBy.AccessibilityId("equals")).click();
	 Thread.sleep(2000);
	driver.findElement(MobileBy.AccessibilityId("clear")).click();
	 driver.navigate().back();
	 Thread.sleep(2000);
	 driver.findElement(MobileBy.AccessibilityId("Phone")).click();
	 Thread.sleep(2000);
	 driver.findElement(MobileBy.AccessibilityId("key pad")).click();
	 Thread.sleep(2000);
	 WebElement we= driver.findElement(MobileBy.AccessibilityId("0,+"));
	AndroidTouchAction actions = new AndroidTouchAction(driver);
	actions.longPress((LongPressOptions.longPressOptions().withElement(ElementOption.element(we)))).perform();
	// TouchAction act = new TouchAction<>(driver);
	// act.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(we)).withDuration(Duration.ofSeconds(2))).release().perform();
	 
	 driver.findElement(MobileBy.AccessibilityId("9,WXYZ")).click();
	 driver.findElement(MobileBy.AccessibilityId("7,PQRS")).click();
	 driver.findElement(MobileBy.AccessibilityId("5,JKL")).click();
	 driver.findElement(MobileBy.AccessibilityId("8,TUV")).click();
	 driver.findElement(MobileBy.AccessibilityId("7,PQRS")).click();
	 driver.findElement(MobileBy.AccessibilityId("0,+")).click();
	 driver.findElement(MobileBy.AccessibilityId("9,WXYZ")).click();
	 driver.findElement(MobileBy.AccessibilityId("0,+")).click();
	 driver.findElement(MobileBy.AccessibilityId("5,JKL")).click();
	 driver.findElement(MobileBy.AccessibilityId("7,PQRS")).click();
	 driver.findElement(MobileBy.AccessibilityId("dial")).click();
	 Thread.sleep(2000);
	 driver.findElement(MobileBy.AccessibilityId("End call")).click();
	 
	 
	
}
}
