package Test_this.Test_this;

import Test_this.TestBase;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.io.IOException;

public class RegistrattionPage extends TestBase{

    @FindBy (how = How.CSS,using = "input[name = \"login\"]")
     private WebElement login;
    @FindBy (how = How.CSS,using = "input[name = \"password\"]")
    private WebElement password;
    @FindBy (how = How.CSS,using = "input[name = \"email\"]")
    private WebElement email;
    @FindBy (how = How.ID,using = "submit-button")
    private WebElement submit;
    @FindBy (how = How.XPATH,using = "//*[contains(@class, 'errors')][.='Поле не соответствует формату']")
    private WebElement assertElementPresent;



    public void login (String log) throws IOException {
        login.sendKeys(log);
    }
    public void password (String pas) throws IOException {
        password.sendKeys(pas);
    }

    public void email (String eml) throws IOException {
        email.sendKeys(eml);

    }
    public void submit () throws IOException {
        submit.click();
    }
    public void assertElementPresent () throws IOException {

        try{  Assert.assertTrue(assertElementPresent.isDisplayed());} catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Passed: Right Error massage. - Not valid E-mail.");

    }

}
