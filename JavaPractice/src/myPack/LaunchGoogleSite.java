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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LaunchGoogleSite
{
	public static String UserName="Saikishan";
	public static String AccessKey="c70f2c00-e2bf-4e94-9327-0f09857e370e";
	public static String myURL="https://" + UserName + ":" + AccessKey + "@ondemand.saucelabs.com:443";
	
	
	@Test(description="Launch Google Site")
	@Parameters({"VMIPAddress", "Port"})
	public void LaunchGoogleSiteTest(String VMIPAddress, String Port ) throws MalformedURLException
	{
		
		//System.setProperty("webdriver.gecko.driver","C:\\Softwares\\geckodriver.exe");
		File file = new File("C:\\Softwares\\IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver",file.getAbsolutePath());
		//URL nodeURL= new URL("http://139.126.189.128:5551/wd/hub");
		URL nodeURL= new URL("http://"+VMIPAddress+":"+Port+"/wd/hub");
		
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("internet explorer");
		cap.setPlatform(Platform.VISTA);
		
		WebDriver driver=new RemoteWebDriver(nodeURL,cap);
		//WebDriver driver=new InternetExplorerDriver();
		driver.get("www.google.com");
		
		/*
		System.setProperty("webdriver.ie.driver","C:\\Softwares\\IEDriverServer32Bit.exe");
		DesiredCapabilities cap=DesiredCapabilities.internetExplorer();
		//cap.setBrowserName("internet explorer");
		//cap.setPlatform(Platform.VISTA);
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		//WebDriver driver=new RemoteWebDriver(new URL("http://139.126.189.128:5551/wd/hub"),cap);
		WebDriver driver=new RemoteWebDriver(new URL("http://139.126.125.34:4444/wd/hub"),cap);
		//WebDriver driver=new InternetExplorerDriver();
		driver.get("www.google.com");
		*/
	}
}
