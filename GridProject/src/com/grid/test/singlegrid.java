package com.grid.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class singlegrid {
	WebDriver driver;
	
	@Test
	public void test2() throws InterruptedException, MalformedURLException
	{
	
	  String URL = "http://www.google.co.uk";
	  String Node = "http://192.168.1.164:4444/wd/hub";
	  DesiredCapabilities cap = DesiredCapabilities.firefox();
	  driver = new RemoteWebDriver(new URL(Node), cap);

	  driver.navigate().to(URL);
	  Thread.sleep(5000);
	  driver.quit();
	}


}
