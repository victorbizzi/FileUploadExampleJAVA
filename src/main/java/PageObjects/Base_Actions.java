package PageObjects;
import Settings.DriverFactory;
import Settings.GlobalVars;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Base_Actions {
    public Base_Actions(){
        PageFactory.initElements(getDriver(), this);
    }
    public WebDriver getDriver() { return DriverFactory.getDriver(); }
    public void navigateTo_URL(String url) { getDriver().get(url); }
    public void waitFor(WebElement element){ //wait the specific element to be visible - good to use a lot
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVars.DEFAULT_EXPLICT_TIMEOUT));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForWebElementAndClick(WebElement element){
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(GlobalVars.DEFAULT_EXPLICT_TIMEOUT));
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}
