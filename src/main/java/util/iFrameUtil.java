package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testbase.WebTestBase;

import java.util.List;

public class iFrameUtil extends WebTestBase {

public static void iFrameUsingWebElement(WebElement childElement , WebElement parentFrame){
    driver.switchTo().frame(childElement);
    System.out.println(childElement.getText());
    driver.switchTo().parentFrame();
    System.out.println(parentFrame.getText());
}

public static void iFrameCount(List<WebElement> elements){
            // we use iframe because if we use xpath or anyother path it will not work it shows more than 1 elements are matching as in iframe inside document there is another document and its called ifame
    System.out.println(elements.size());
}

public static void iFrameUsingIndex(List<WebElement> elements){
    //By Index
    driver.switchTo().frame(1);                              //here it successfully transfer from one frame to another by using index it start from 0 , it time cunsuming so mostly we not using it
    System.out.println(elements.getClass());
    driver.switchTo().parentFrame();
}

public static void iFrameUsingNameOrID(List<WebElement> elements){
    driver.switchTo().frame((WebElement) elements);                              //here it successfully transfer from one frame to another for that here we use id locator
}
}
