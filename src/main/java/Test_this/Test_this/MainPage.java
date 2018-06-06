package Test_this.Test_this;

import Test_this.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class MainPage extends TestBase {



    @FindBy(css ="a[href=\"/login/\"]") private WebElement LoginInLink;
    @FindBy(css ="a[href=\"/register/\"]") private WebElement SignInLink;

    public void openRegistration()  {
      LoginInLink.sendKeys(Keys.ENTER);
      SignInLink.sendKeys(Keys.ENTER);
    }


}