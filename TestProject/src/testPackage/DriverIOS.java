package testPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class DriverIOS {

	public static IOSDriver<WebElement> driverIOS() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.4");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 12 Pro");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
		dc.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT, 50000);
		dc.setCapability("commandTimeuts", "12000");

		dc.setCapability(MobileCapabilityType.APP, "/Users/macbookpro/Desktop/UIKitCatalog.app");
		
		IOSDriver<WebElement> driver = new IOSDriver <>(new URL("http://localhost:4723/wd/hub"), dc);
		
		return driver;
		
	
	}

}
