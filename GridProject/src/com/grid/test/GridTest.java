package com.grid.test;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GridTest {
	
	WebDriver driver;
	Platform Win7;
	String nodeURL;
	
	@Parameters({"portNo"})
	@BeforeTest
	public void setupnodes(String portNo) throws MalformedURLException
	{	
				
		if(portNo.equalsIgnoreCase("4546"))
		{
			nodeURL="http://10.88.2.216:"+portNo+"/wd/hub";
			System.out.println("Chrome desired env..");
			DesiredCapabilities cap= new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			System.out.println("Hi");
			
			driver=new RemoteWebDriver(new URL(nodeURL),cap);
			driver.manage().window().maximize();
		
			 			
		}else if(portNo.equalsIgnoreCase("4545"))
		{
			nodeURL="http://10.88.2.75:"+portNo+"/wd/hub";
			System.out.println("IE desired env..");
			DesiredCapabilities cap2= new DesiredCapabilities();
			cap2.setBrowserName("internet explorer");
			cap2.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			cap2.setPlatform(Platform.WINDOWS);
			
			driver=new RemoteWebDriver(new URL(nodeURL),cap2);
			driver.manage().window().maximize();
			
		}
	}
	
	
	@Test
	public void test1()
	{
		System.out.println("Testing start here...");
		driver.navigate().to("http://www.google.co.uk");
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
		System.out.println("Browser get closed down");
	}

}
