package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class OrderPage extends WebTestBase {


    public OrderPage(){

        PageFactory.initElements(driver,this);
    }
    public void getTexOfOrderPage(){

      //  return WebElementUtil.getTextOfElement();
    }
}
