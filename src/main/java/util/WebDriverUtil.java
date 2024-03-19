package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.WebTestBase;

import java.time.Duration;

public class WebDriverUtil extends WebTestBase {
    public static final long IMPLICIT_WAIT =30;
    public static final long EXPLICIT_WAIT =30;
    public static final long PAGE_LOAD_TIMEOUT = 30;
    public static WebDriverWait webDriverWait;
    public static String waitElementUntilClickable(WebElement element){
        webDriverWait =new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(element)).click();
      //  webDriverWait.until(ExpectedConditions.elementToBeSelected(element));
        return null;
    }
 /*public static void checkBoxIsSelected(WebElement element){
        webDriverWait =new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT));
       return webDriverWait.until(ExpectedConditions.elementToBeSelected(element));
    }*/


}
