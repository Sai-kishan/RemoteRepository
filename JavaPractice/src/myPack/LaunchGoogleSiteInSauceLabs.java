package myPack;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LaunchGoogleSiteInSauceLabs
{
	public static String UserName="Saikishan";
	public static String AccessKey="c70f2c00-e2bf-4e94-9327-0f09857e370e";
	public static String myURL="https://" + UserName + ":" + AccessKey + "@ondemand.saucelabs.com:443"+"/wd/hub";
	
	WebDriver driver=null;
	
	@Test(description="Launch Google Site")
	public void LaunchGoogleSiteTest() throws MalformedURLException
	{
		
		File file = new File("C:\\Softwares\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver",file.getAbsolutePath());
	
		//URL nodeURL= new URL("http://139.126.189.128:5551/wd/hub");
		//URL nodeURL= new URL("http://"+VMIPAddress+":"+Port+"/wd/hub");
		
		URL nodeURL=new URL(myURL);
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.WIN8_1);
		cap.setBrowserName("internet explorer");
		cap.setCapability("version", "11");
		
		driver=new RemoteWebDriver(nodeURL,cap);
		driver.get("www.google.com");
		String pageTitle=driver.getTitle();
		
		Assert.assertEquals("Google",pageTitle);
	}
	
	@AfterTest
	public void close()
	{
		driver.close();
		driver.quit();
	}
}
