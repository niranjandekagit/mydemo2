package com.grid.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class test1 {

	
	@Test
	public void test11() throws InterruptedException{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\niranjan.deka\\cognizant-intelligent-test-scripter-1.0-setup (1)\\cognizant-intelligent-test-scripter-1.0\\lib\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\niranjan.deka\\cognizant-intelligent-test-scripter-1.0-setup (1)\\cognizant-intelligent-test-scripter-1.0\\lib\\Drivers\\IEDriverServer64.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		 DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		 caps.setCapability("ignoreZoomSetting", true);
		 caps.setCapability("nativeEvents",false);
		 WebDriver driver = new InternetExplorerDriver(caps);

		driver.get("http://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Test");

		Thread.sleep(4000);
	        driver.close();
	}
}
