package com.company.automation;

import com.company.core.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class LoginTests extends BaseTest {



        // @Test (priority = 1)
        //  public vo
        //@Ignore


        @Test(dataProvider  = "loginErrorData")
        public void testUntitledTestCase(String username,String passw,String expectedMsg) throws Exception {
           // String username = "user";
           // String passw = "123";
           // String expectedMsg = "Invalid email address.";

            driver.get("http://automationpractice.com/index.php");

            driver.findElement(By.linkText("Sign in")).click();
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys("user");
            driver.findElement(By.xpath("//form[@id='login_form']/div")).click();
            driver.findElement(By.id("passwd")).click();
            driver.findElement(By.id("passwd")).clear();
            driver.findElement(By.id("passwd")).sendKeys("1244");
            driver.findElement(By.xpath("//button[@id='SubmitLogin']/span")).click();


           // driver.findElement(By.id("search_query_top")).click();
           // driver.findElement(By.id("search_query_top")).clear();
           // driver.findElement(By.id("search_query_top")).sendKeys("glass");
           // driver.findElement(By.id("searchbox")).submit();
           // driver.findElement(By.linkText("Contact us")).click();
            //driver.get("http://mycompany.site.com");
            // Assert.assertEquals(driver.findElement(By.xpath()));
            //WebElement element = driver.findElement(By.id(#element_id)));
        }


        @Test
        @Ignore
        public  void  testLoginSuccess(){}

        @DataProvider (name = "loginErrorData")
        public Object [][] LoginErrorDataProvider() throws FileNotFoundException {
            String path = "/Users/osukono/viktoria/MavenProject/TestData/login-tests.csv";
            Scanner scanner = new Scanner(new FileInputStream(path), StandardCharsets.UTF_8);
            List <String> lines = new ArrayList<>();
            //
                    while (scanner.hasNext()){
                        String nextLine = scanner.nextLine();
                        System.out.println(nextLine);
                    }
                    scanner.close();
            Object [] [] data = new Object[lines.size()][3];
                    for (int i =0; i<lines.size(); i++){
                      String[] linePart =  lines.get(i).split(",");
                      data[i][0] = linePart[0];
                      data[i][1] = linePart[1];
                      data[i][2] = linePart[2];
            }
                    return data;
                    //return new Object[][]{{"user","123","Invalid email address."}};
        }
    }


