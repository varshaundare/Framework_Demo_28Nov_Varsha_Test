package util;

import org.openqa.selenium.Alert;
import testbase.WebTestBase;

public class AlertUtils extends WebTestBase {
    public static Alert alert;
    public static void alertAccept(){
        alert= driver.switchTo().alert();                                                      //here we got alert message so we need to handle it
        alert.accept();
    }

    public static void alertDismiss(){
        alert=driver.switchTo().alert();                                  //here we switchto that alrtpopup                //alert is an interface and we have to handle it other wise get exception by using this we can handle it
        System.out.println(alert.getText());                                    //get text of alert
        alert.dismiss();
    }
}
