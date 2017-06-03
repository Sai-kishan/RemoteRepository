package myPack;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchGitHubSite 
{
	@Parameters({"VMIPAddress","Port"})
	@Test(description="Launch Git Hub Site")
	public void testA(String VMIPAddress, String Port) throws MalformedURLException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Softwares\\geckodriver.exe");
		//URL nodeURL= new URL("http://139.126.189.128:5551/wd/hub");
		URL nodeURL = new URL("http://"+VMIPAddress+":"+Port+"/wd/hub");
		
		//Set the desired capabilities
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.VISTA);
		
		
		WebDriver driver=new RemoteWebDriver(nodeURL,cap);
		driver.get("https://github.com");
		
	}
}
