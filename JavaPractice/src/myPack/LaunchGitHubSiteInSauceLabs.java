package myPack;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchGitHubSiteInSauceLabs 
{
	public static String UserName="Saikishan";
	public static String AccessKey="c70f2c00-e2bf-4e94-9327-0f09857e370e";
	public static String myURL="https://" + UserName + ":" + AccessKey + "@ondemand.saucelabs.com:443"+"/wd/hub";
	WebDriver driver=null;
	
	@Test(description="Launch Git Hub Site in Sauce Labs")
	public void testA() throws MalformedURLException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\geckodriver.exe");
		//URL nodeURL= new URL("http://139.126.189.128:5551/wd/hub");
		URL nodeURL = new URL(myURL);
		
		
		//Set the desired capabilities
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.VISTA);
		cap.setBrowserName("firefox");
		cap.setCapability("version", "40");
		
		driver=new RemoteWebDriver(nodeURL,cap);
		driver.get("https://github.com");
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver.quit();
	}
}
