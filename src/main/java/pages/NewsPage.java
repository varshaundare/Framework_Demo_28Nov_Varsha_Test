package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.WebElementUtil;

public class NewsPage extends WebTestBase {
    @FindBy(xpath = "//span[@class='featured_article-background']")
    WebElement newsPage;
    public NewsPage(){

        PageFactory.initElements(driver, this);
    }
    public String getTexOfNewsPage(){

        return WebElementUtil.getTextOfElement(newsPage);
    }
    public String getTextOfNewsPage(){

        return WebElementUtil.getTextOfElement(newsPage);
    }
}
