package mobilrtesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;

public class generalstore {
	
		public static AndroidDriver<AndroidElement> cap1() throws MalformedURLException {
	//AndroidDriver<AndroidElement> driver;
	 DesiredCapabilities dc=new DesiredCapabilities();
	 dc.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
	 dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	 dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.ANDROID_UIAUTOMATOR2);
	 dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.androidsample.generalstore");
	 dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.androidsample.generalstore.SplashActivity");
	AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),dc);
	return driver;
	 }
}


