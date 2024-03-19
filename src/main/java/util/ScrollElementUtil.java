package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import testbase.WebTestBase;

public class ScrollElementUtil extends WebTestBase {
    public static JavascriptExecutor javascriptExecutor;
    public static void scrollElementByPixel() {

        javascriptExecutor = (JavascriptExecutor) driver;             //for scrollup and down compulsary we have create javascripExicuter object
        javascriptExecutor.executeScript("window.scrollBy(0,500)");      //to go down            //format is  executeScript("window.scrollBy(x-path,y-path)"
        javascriptExecutor.executeScript("window.scrollBy(0,-500)");      //to go up
    }

    public static void scrollElementByWebElement(WebElement element){
        javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
    }
}
