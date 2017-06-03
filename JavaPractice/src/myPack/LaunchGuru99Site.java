package myPack;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class LaunchGuru99Site
{
	@Parameters({"VMIPAddress","Port"})
	@Test(description="Testing parameters annotation")
	public void testA(String VMIPAddress, String Port) throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriver.exe");
		
		//URL nodeURL= new URL("http://139.126.189.128:5551/wd/hub");
		URL nodeURL=new URL("http://"+VMIPAddress+":"+Port+"/wd/hub");
		
		//Set the desired capabilities
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.VISTA);
		
		
		WebDriver driver=new RemoteWebDriver(nodeURL,cap);
		driver.get("http://www.guru99.com");
		
	}
	
}

