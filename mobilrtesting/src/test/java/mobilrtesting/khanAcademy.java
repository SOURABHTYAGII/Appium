package mobilrtesting;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class khanAcademy {
	AndroidDriver<WebElement> driver;
	private Object action;
	private WebElement element;
	 @BeforeTest
	 public void beforeTest() throws MalformedURLException {
	 DesiredCapabilities dc=new DesiredCapabilities();
	 dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
	 dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
	 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"org.khanacademy.android");
	 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "org.khanacademy.android.ui.library.MainActivity");
	 driver =new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	 }
	 @Test
	 public void signup() throws InterruptedException {
	 System.out.println("Automation start");
	 Thread.sleep(2000);
	driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sign in\")")).click();
	 Thread.sleep(2000);
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Continue with Google\")")).click();
	 Thread.sleep(5000); 
	 
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sourabh Tyagi\")")).click();
	 Thread.sleep(8000);
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Join class\")")).click();
	 Thread.sleep(2000);
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"e.g. ABC123 or teacher@example.com\")")).sendKeys("mailatsourabh@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ADD\")")).click();
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"ADD\")")).click();
	 Alert alt = driver.switchTo().alert();
	 alt.dismiss();
	 Thread.sleep(2000);
	 driver.findElement(MobileBy.AccessibilityId("Dismiss")).click();
	 Thread.sleep(2000);
	// driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Grammar\")")).click();
	// driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Grammar\").instance(0))").click();
	// TouchActions action = new TouchActions(driver);
	//action.scroll(element, 80, 150);
	// action.perform();
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Explore\")")).click();
	 Thread.sleep(2000);
	 driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().text(\"Surprise me!\")")).click();
	 Thread.sleep(2000);
	 driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	 driver.navigate().back();
	 //   driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Grammar\"))").click();
    // Thread.sleep(2000);
   	/* driver.findElement(MobileBy.AccessibilityId("plus")).click();
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
	actions.longPress((LongPressOptions.longPressOptions().withElement(ElementOption.element(we)))).perform();*/


}
}
