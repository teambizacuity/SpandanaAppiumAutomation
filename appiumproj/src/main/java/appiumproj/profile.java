package appiumproj;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.touch.TouchActions;

public class profile {

  private AndroidDriver driver;

  @Before
  public void setUp() throws MalformedURLException {
  	    DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
  	    desiredCapabilities.setCapability("platformName", "Android");
  	    desiredCapabilities.setCapability("platformVersion", "11.0");
  	    desiredCapabilities.setCapability("deviceName", "Nexus 6");
  	    desiredCapabilities.setCapability("app", "C:\\Expo.apk.apk");
  	    desiredCapabilities.setCapability("appPackage", "host.exp.exponent");
  	    desiredCapabilities.setCapability("appActivity", ".experience.HomeActivity");
  	    desiredCapabilities.setCapability("automationName", "UiAutomator2");
  	    desiredCapabilities.setCapability("ensureWebviewsHavePages", "true");

  	    URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

  	    driver = new AndroidDriver(remoteUrl, desiredCapabilities);
  }

  @Test
  public void alltest() {
	  new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Open from Clipboard']"))).click();
	  new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Description']")));
	  new TouchAction(driver).press(PointOption.point(870,781)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(30))).moveTo(PointOption.point(874,588)).release().perform();
	  WebElement el1 = (new WebDriverWait(driver,60)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@text='Open Project Using Expo']")));
	  el1.click();
	  new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='English']")));
      driver.findElement(By.xpath("//*[@text='English']")).click();
      new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Got it']")));
      driver.navigate().back();
	  WebElement e14 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")));
	  e14.sendKeys("7036780100");  //your number
      driver.findElement(By.xpath("//*[@text='SEND OTP']")).click();
      WebElement e16 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")));
	  e16.sendKeys("1001"); //OTP override
	  WebElement el7 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup")));
	  el7.click();//MENU
	  new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Profile']")));
      driver.findElement(By.xpath("//*[@text='Profile']")).click();
      WebElement el9 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")));
      el9.click();

  }
  @After
  public void tearDown() {
     driver.quit();   
  }
}