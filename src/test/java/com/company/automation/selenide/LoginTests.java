package com.company.automation.selenide;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.company.automation.selenide.page.HomePage;
import com.company.core.TestListener;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.*;


public class LoginTests {



    @BeforeClass
    public void setUp() {
        Configuration.browser="safari";
        Configuration.baseUrl = "http://automationpractice.com/index.php";
        Configuration.startMaximized = true;
        Configuration.timeout = 10;
      //  SelenideLogger.addListener(new AllureSele);

        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );
    }
@Description("Login form Test")
@Issues({@Issue("123"), @Issue("31")})
@Severity(SeverityLevel.CRITICAL)
    @Test
    public void testLoginError() {
    open("http://automationpractice.com/index.php");
    }

    @Test(dataProvider = "loginErrorProvider")

    public void testLoginError(String username, String password, String expectedMsg) {
        open(Configuration.baseUrl);
//        $(By.linkText("Sign in")).click();
//        $(By.id("email")).sendKeys(username);
//        $(By.id("passwd")).sendKeys(password);
//        $(By.xpath("//button[@id='SubmitLogin']/span")).click();
//        String actualMsg = $(By.xpath("//div[@id='center_column']/div/ol/li")).getText();
//
//        Assert.assertEquals(actualMsg, expectedMsg);

        String actualMsg =
                new HomePage()
                        .goToHome()
                        .clickSignIn()
                        .fillEmail(username)
                        .fillPassword(password)
                        .submit()
                        .getErrorMessage();

        Assert.assertEquals(actualMsg, expectedMsg);
    }

    @AfterClass
    public void tearDown() {
    //closeWindow();
    }
    @DataProvider
    public Object[][] loginErrorProvider() {
        return new Object[][] {
                {"user","123","Invalid email address."}
        };
    }

}
