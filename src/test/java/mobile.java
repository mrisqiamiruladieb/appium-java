import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class mobile {
    public static AndroidDriver driver; // initialize android driver for appium
    public static DesiredCapabilities capabilities; // initialize desired capabilities for device setup
    public static String baseUrl = "http://127.0.0.1:4723/"; // appium server url

    @Test
    public void main() throws MalformedURLException {
        // setup device to interact with appium server
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Rizqi's S");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "14.0");
        capabilities.setCapability("automationName", "UiAutomator2");
        // set apk file directory, install, and run the app
        capabilities.setCapability("app", System.getProperty("user.dir") + "\\src\\test\\java\\apk\\Diet_meal.apk");
//        capabilities.setCapability("app", "D:\\belajar\\appium-java\\src\\test\\java\\apk\\Diet_meal.apk");
        // run the installed app
//        capabilities.setCapability("appPackage", "com.fghilmany.dietmealapp");
//        capabilities.setCapability("appActivity", ".ui.main.MainActivity");
//        capabilities.setCapability("appActivity", "com.fghilmany.dietmealapp.ui.main.MainActivity");
        capabilities.setCapability("autoGrantPermissions", true); // set auto accept permission request setting
        capabilities.setCapability("autoAcceptAlerts", true); // set auto accept all possible appearing alert

        // set driver
        URL url = new URL(baseUrl);
        driver = new AndroidDriver(url, capabilities); // open app

        // wait to prevent errors
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        // process flow
        // input name, weight, height
        driver.findElement(AppiumBy.id("com.fghilmany.dietmealapp:id/et_name")).sendKeys("Mike");
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/et_weight")).sendKeys("75");
        driver.findElement(AppiumBy.id("com.fghilmany.dietmealapp:id/et_height")).sendKeys("175");
        // Click on male radio button
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/rb_male")).click();
        // Click on next button
        driver.findElement(AppiumBy.id("com.fghilmany.dietmealapp:id/bt_next")).click();
        // Click option radio button
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/rb_medium")).click();
        // Click on finish button
        driver.findElement(AppiumBy.id("com.fghilmany.dietmealapp:id/bt_finish")).click();

        // assertion
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/tv_header_name")).isDisplayed();

        // close app
        driver.quit();
    }
}
