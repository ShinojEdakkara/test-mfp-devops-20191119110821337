package com.testdroid.appium.android.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;


import org.apache.commons.io.FileUtils;


import com.testdroid.appium.BaseAndroidTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.testdroid.appium.FileUploader;
import com.testdroid.appium.ServerUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

public class AndroidAppiumResourceTest extends BaseAndroidTest {

    public WebDriverWait wait;
    public ServerUtil serverutil;
    
    @BeforeClass
    public void setUp() throws Exception {
        setUpTest();
     //   serverutil = ServerUtil.getInstance();
        wait = new WebDriverWait(wd, 120);
    }
    @AfterClass
    public void tearDown()
    {
        quitAppiumSession();
    }


    @Test
    public void mainPageTest() throws IOException, InterruptedException {
wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        takeScreenshot("start");
        /*wd.findElement(By.xpath("//android.widget.RadioButton[@text='Use Testdroid Cloud']")).click();
        wd.findElement(By.xpath("//android.widget.EditText[@resource-id='com.bitbar.testdroid:id/editText1']")).sendKeys("John Doe");
        takeScreenshot("after_adding_name");
        wd.navigate().back();
        wd.findElement(By.xpath("//android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Button[1]")).click();
        takeScreenshot("after_answer");*/
        
        wd.findElement(By.xpath("//android.widget.EditText[@resource-id='com.sample.resourcerequestandroid:id/resource']")).sendKeys("Endpoint");
        takeScreenshot("after_entering_resource_endpoint");
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
        takeScreenshot("after_clicking_button");
            
    }
}
