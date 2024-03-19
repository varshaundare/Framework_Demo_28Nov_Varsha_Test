package util;

import org.openqa.selenium.WebElement;
import testbase.WebTestBase;

public class WebElementUtil extends WebTestBase {
    public static void clickOnElement(WebElement element){

        element.click();
    }
  public static void sendKeysOnElement(WebElement element, String text){

        element.sendKeys(text);
  }

  public static String getTextOfElement(WebElement webElement){

        return webElement.getText();
  }

  public static void clickableElement(WebElement element){

        element.isEnabled();
  }
    public static void selectElement(WebElement element){

        element.isSelected();
    }
    public static void displayElement(WebElement element){

        element.isDisplayed();
    }
}
