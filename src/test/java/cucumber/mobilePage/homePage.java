package cucumber.mobilePage;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class homePage {
    AndroidDriver driver;

    // constructor
    public homePage(AndroidDriver driver){
        this.driver=driver;
    }

    // element locator
    By nameForm = AppiumBy.id("com.fghilmany.dietmealapp:id/et_name");
    By weightForm = AppiumBy.id("com.fghilmany.dietmealapp:id/et_weight");
    By heightForm = AppiumBy.id("com.fghilmany.dietmealapp:id/et_height");


    // element method
    public void inputForm(String name, String weight, String height){
        driver.findElement(nameForm).sendKeys(name);
        driver.findElement(weightForm).sendKeys(weight);
        driver.findElement(heightForm).sendKeys(height);
    }
}
