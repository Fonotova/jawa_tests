package com.company.automation.kdt.engine;

import com.company.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class KeywordAccountIdentity {
    private WebDriver driver;

    public KeywordAccountIdentity(WebDriver driver) {
        this.driver = driver;
    }

    public void doAction(String action, String object, String value) {
        switch (action) {
            case "ASSERT":
                doAssert(object, value);
                break;

            case "CLICK":
                click(object, value);
                break;
        }
    }

    private void doAssert(String object, String value) {
        switch (object) {
//            case "usernameLinkText":

//                Assert.assertEquals(
//                        new MyAccount(driver).getUserNameCapture(), value);
//                break;

            case "msgErrText":
                Assert.assertEquals(
                        new LoginPage(driver).getErrorMessage(), value);
                break;

            default:
                throw new RuntimeException("Unsupported operation " + object + " " + value);
        }
    }

    private void click(String object, String value) {
        switch (object) {
            case "signOutButton":
//                new AccountPage(driver).clickLogout();
                break;
        }
    }
}
