package testPackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Driver {

	public static AndroidDriver<AndroidElement> driverEmulator() throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();

		//Creating Application path
		File parent = new File("src");
		File app = new File(parent, "ApiDemos-debug.apk");

		//url (Local machine)
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		//Device name
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "TestEmulator");
		//		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		//Application path
		dc.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//Automation name - FW to automate test on device - given by appium
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(url, dc);

		return driver;

	}
	
	public static AndroidDriver<AndroidElement> driverReal() throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();

		//Creating Application path
		File parent = new File("src");
		File app = new File(parent, "ApiDemos-debug.apk");

		//url (Local machine)
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		//Device name
//		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "TestEmulator");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		//Application path
		dc.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		//Automation name - FW to automate test on device - given by appium
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(url, dc);

		return driver;

	}
}
