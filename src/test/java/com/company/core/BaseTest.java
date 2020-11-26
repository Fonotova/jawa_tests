package com.company.core;

import io.qameta.allure.Attachment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class BaseTest {
    private static Logger LOG = LogManager.getLogger(BaseTest.class.getName());
    protected EventFiringWebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();


    @Parameters("browser")
    @BeforeClass(alwaysRun = true)
    public void setUp(@Optional("chrome") String browser) throws Exception {
        String path = System.getProperty("cfg");
        InputStream is;
        if (path == null)
            is = this.getClass().getClassLoader().getResourceAsStream("demo.properties");
        else
            is = new FileInputStream(path);
        Properties properties = new Properties();
        properties.load(is);
        String chromeDriver = properties.getProperty("driver.chrome");
        String screenDir = properties.getProperty("screen.dir");


        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/Users/osukono/viktoria/MavenProject/drivers/chromedriver");
            driver = new EventFiringWebDriver(new ChromeDriver());

        } else if (browser.equals("firefox")) {
            driver = new EventFiringWebDriver(new FirefoxDriver());
        }
        else if (browser.equals("safari")) {
            driver = new EventFiringWebDriver(new SafariDriver());
        }

        //esle if
        //System.setProperty("webdriver.chrome.driver","/Users/osukono/viktoria/MavenProject/drivers/chromedriver");
        // driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.register(new EventFiringWebDriverListenerImpl("/Users/osukono/viktoria/screens"));

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }


    @BeforeMethod
    public void testStart(Method method, Object[] params) {
        LOG.info("test {} starts with params: {}",
                method.getName(), Arrays.toString(params));
    }

    @AfterMethod
    public void testComplete(Method method) {
        LOG.info("test {} finished.", method.getName());
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }



    @Attachment(value = "Page screenshot", type = "image/png")
    public byte[] makeScreenshot() {
        return driver.getScreenshotAs(OutputType.BYTES);
    }
}
