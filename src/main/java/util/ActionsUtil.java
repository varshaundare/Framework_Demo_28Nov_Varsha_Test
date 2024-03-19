package util;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import testbase.WebTestBase;

import java.time.Duration;

public class ActionsUtil extends WebTestBase {
    public static Actions actions;

public static void moveToElement(WebElement element){
    actions = new Actions(driver);
    actions.moveToElement(element)
            .pause(Duration.ofSeconds(5))
            .perform();
}
public static void dragAndDropElement(WebElement srcElement, WebElement dropElement ){
    actions = new Actions(driver);
    actions.dragAndDrop(srcElement, dropElement)
            .pause(Duration.ofSeconds(5))
            .perform();
}

public static void doubleClickAction(WebElement element){
    actions = new Actions(driver);
    actions.doubleClick(element)
            .pause(Duration.ofSeconds(5))
            .build()
            .perform();
}

public static void contextRightClick(WebElement element){
    actions = new Actions(driver);
    actions.contextClick(element)
            .pause(Duration.ofSeconds(5))
            .perform();
}

public static void clickAndHoldElement(WebElement element){
    actions = new Actions(driver);
    actions.clickAndHold(element)
            .pause(Duration.ofSeconds(5))
            .release()
            .pause(Duration.ofSeconds(5))
            .build()
            .perform();
}

public static void keyBoardEnterKey(WebElement element){
    actions = new Actions(driver);
    actions.moveToElement(element)
            .click(element)
            .pause(Duration.ofSeconds(5))
            .keyDown(Keys.ENTER)
            .pause(Duration.ofSeconds(5))
            .keyUp(Keys.SHIFT)
            .pause(Duration.ofSeconds(5))
            .build()
            .perform();
}
}
