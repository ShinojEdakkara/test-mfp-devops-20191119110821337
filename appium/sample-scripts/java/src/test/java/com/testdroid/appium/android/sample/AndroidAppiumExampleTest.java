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

public class AndroidAppiumExampleTest  extends BaseAndroidTest {

    public WebDriverWait wait;
    public ServerUtil serverutil;
    
    @BeforeClass
    public void setUp() throws Exception {
        setUpTest();
     //   serverutil = ServerUtil.getInstance();
        wait = new WebDriverWait(wd, 30);
    }
    @AfterClass
    public void tearDown()
    {
        quitAppiumSession();
    }


    @Test
    public void mainPageTest() throws IOException, InterruptedException {
        wd.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        
        try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
            }
	
	takeScreenshot("start");
        /*wd.findElement(By.xpath("//android.widget.EditText[@resource-id='com.sample.resourcerequestandroid:id/resource']")).sendKeys("protected");
        takeScreenshot("after_entering_resource_endpoint");*/
        wd.findElement(By.xpath("//android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
        takeScreenshot("after_clicking_button");
    }
}
