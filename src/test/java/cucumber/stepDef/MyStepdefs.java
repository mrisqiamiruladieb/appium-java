package cucumber.stepDef;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {

    public static AndroidDriver driver; // initialize android driver for appium
    public static DesiredCapabilities capabilities; // initialize desired capabilities for device setup
    public static String baseUrl = "http://127.0.0.1:4723/"; // appium server url

    @Given("Membuka Aplikasi")
    public void membukaAplikasi() throws MalformedURLException {
        // setup device to interact with appium server
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Rizqi's S");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "14.0");
        capabilities.setCapability("automationName", "UiAutomator2");
        // run the installed app
        capabilities.setCapability("appPackage", "com.fghilmany.dietmealapp");
        capabilities.setCapability("appActivity", ".ui.main.MainActivity");
        capabilities.setCapability("autoGrantPermissions", true); // set auto accept permission request setting
        capabilities.setCapability("autoAcceptAlerts", true); // set auto accept all possible appearing alert

        // set driver
        URL url = new URL(baseUrl);
        driver = new AndroidDriver(url, capabilities); // open app

        // wait to prevent errors
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @When("Masukan Data")
    public void masukanData() {
        // input name, weight, height
        driver.findElement(AppiumBy.id("com.fghilmany.dietmealapp:id/et_name")).sendKeys("Mike");
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/et_weight")).sendKeys("75");
        driver.findElement(AppiumBy.id("com.fghilmany.dietmealapp:id/et_height")).sendKeys("175");
        // Click on male radio button
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/rb_male")).click();
        // Click on next button
        driver.findElement(AppiumBy.id("com.fghilmany.dietmealapp:id/bt_next")).click();
    }

    @And("Klik Lanjutkan")
    public void klikLanjutkan() {
        // Click option radio button
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/rb_medium")).click();
        // Click on finish button
        driver.findElement(AppiumBy.id("com.fghilmany.dietmealapp:id/bt_finish")).click();
    }

    @Then("Pengguna di beranda Diet App")
    public void penggunaDiBerandaDietApp() {
        // assertion
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/tv_header_name")).isDisplayed();
    }

    @When("^Masukan Data (.*), (.*), (.*) sebagai nama, berat, tinggi$")
    public void masukanDataNameWeightHeightSebagaiNamaBeratTinggi(String name, String weight, String height) {
        // input name, weight, height
        driver.findElement(AppiumBy.id("com.fghilmany.dietmealapp:id/et_name")).sendKeys(name);
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/et_weight")).sendKeys(weight);
        driver.findElement(AppiumBy.id("com.fghilmany.dietmealapp:id/et_height")).sendKeys(height);
        // Click on male radio button
        driver.findElement(By.id("com.fghilmany.dietmealapp:id/rb_male")).click();
        // Click on next button
        driver.findElement(AppiumBy.id("com.fghilmany.dietmealapp:id/bt_next")).click();
    }

    @Then("^Pengguna (.*) di beranda Diet App$")
    public void penggunaStatusDiBerandaDietApp(String status) {
        if (status == "Passed"){
            // assertion
            driver.findElement(By.id("com.fghilmany.dietmealapp:id/tv_header_name")).isDisplayed();
        }
    }
}
