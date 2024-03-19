package util;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testbase.WebTestBase;

public class DropDownUtil extends WebTestBase {
    public static Select select;
    public static void dropDownElementSelectByIndex(int index, WebElement element){
        select = new Select(element);
        select.selectByIndex(index);
    }
    public static void dropDownElementSelectByVisibleText(String visibleText, WebElement element){
        select = new Select(element);
        select.selectByVisibleText(visibleText);
    }
    public static void dropDownElementSelectByValue(String value, WebElement element){
        select = new Select(element);
        select.selectByValue(value);
    }
    public static void dropDownElementDeselectByIndex(int index, WebElement element){
        select = new Select(element);
        select.deselectByIndex(index);
    }
    public static void dropDownElementDeselectByVisibleText(String visibleText, WebElement element){
        select = new Select(element);
        select.deselectByVisibleText(visibleText);
    }
    public static void dropDownElementDeselectByValue(String value, WebElement element){
        select = new Select(element);
        select.deselectByValue(value);
    }


}
