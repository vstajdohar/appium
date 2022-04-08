package testPackage;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class HelloWorld extends Driver{


	public static void main(String[] args) throws MalformedURLException {

		AndroidDriver<AndroidElement> driver = driverEmulator();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*xpath id claasName -> uiAutomator
		 * 
		 * xpath Sytax: //tagName[@attribut='value']
		 * tagName - class (android.widget.TextView)
		 */

		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
		driver.findElementByClassName("android.widget.EditText").sendKeys("HelloWorld");
		driver.findElementsByClassName("android.widget.Button").get(1).click();
		driver.closeApp();
//
//		AndroidDriver<AndroidElement> driver2 = driver();
//
//		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//		//selecting element by AndroidUIAutomator
//		driver2.findElementByAndroidUIAutomator("text(\"Views\")").click();
//		//Check properties using AndroidUIAutomator
//		List<AndroidElement> elementsFalse = driver2.findElementsByAndroidUIAutomator("new UiSelector().selected(false)");
//		List<AndroidElement> elementsTrue = driver2.findElementsByAndroidUIAutomator("new UiSelector().selected(true)");
//		Integer noOfElements = elementsFalse.size()+elementsTrue.size();
//		System.out.println("No of elements: " + noOfElements);
//		System.out.println("No of elements False: " + elementsFalse.size());
//		System.out.println("No of elements True: " + elementsTrue.size());
//		
//		driver2.closeApp();
		
		//Touch - Click
//		AndroidDriver<AndroidElement> driver3 = driver();                
//		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//		
//		driver3.findElementByXPath("//android.widget.TextView[@text='Views']").click(); 
//		
//		TouchAction touch = new TouchAction(driver3);
//		WebElement expandLists = driver3.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
//		touch.tap(tapOptions().withElement(element(expandLists))).perform();
//		
//		WebElement customAdapter = driver3.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
//		touch.tap(tapOptions().withElement(element(customAdapter))).perform();
//		
//		WebElement peopleNames = driver3.findElementByXPath("//android.widget.TextView[@text='People Names']");
//		touch.longPress(longPressOptions().withElement(element(peopleNames)).withDuration(ofSeconds(2))).release().perform();
//		
//		driver3.closeApp();
		
		//Touch - swipe
//		AndroidDriver<AndroidElement> driver4 = driver();                
//		driver4.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
//		
//		driver4.findElementByXPath("//android.widget.TextView[@text='Views']").click(); 
//		driver4.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click(); 
//		driver4.findElementByXPath("//android.widget.TextView[@text='2. Inline']").click(); 
//		
//		driver4.findElementByXPath("//*[@content-desc='9']").click();
//		
//		TouchAction touch2 = new TouchAction(driver4);
//		
//		WebElement min15 = driver4.findElementByXPath("//*[@content-desc='15']");
//		WebElement min45 = driver4.findElementByXPath("//*[@content-desc='45']");
//		
//		touch2.longPress(longPressOptions().withElement(element(min15)).withDuration(ofSeconds(2))).moveTo(element(min45)).release().perform();
//		
//		driver4.closeApp();
		
//		AndroidDriver<AndroidElement> driver5 = driver();                
//		driver5.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver5.findElementByXPath("//android.widget.TextView[@text='Views']").click(); 
//		
//		driver5.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
//		
//		
//		driver5.closeApp();
		
//		AndroidDriver<AndroidElement> driver6 = driver();                
//		driver6.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		driver6.findElementByXPath("//android.widget.TextView[@text='Views']").click();
//		driver6.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();
//		
//		WebElement drag = driver6.findElementByXPath("//android.view.View[@index='1']");
//		WebElement drop = driver6.findElementsByClassName("android.view.View").get(2);
//		
//		TouchAction touch3 = new TouchAction(driver6);
//		
////		touch3.longPress(longPressOptions().withElement(element(drag)).withDuration(ofSeconds(2))).moveTo(element(drop)).release().perform();
//		//If there are no additional actions on longPress like duration can be done like in following line:
//		touch3.longPress((element(drag))).moveTo(element(drop)).release().perform();
//		
//		driver6.closeApp();
	}  

}
