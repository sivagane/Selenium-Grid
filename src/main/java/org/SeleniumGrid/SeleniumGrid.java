package org.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
         DesiredCapabilities cap= new DesiredCapabilities();
         cap.setBrowserName("firefox");
         cap.setPlatform(Platform.WIN10);
         
//         ChromeOptions options= new ChromeOptions();
//         options.merge(cap);
//         
         String huburl="http://192.168.43.5:4444/wd/hub";
         WebDriver driver=new RemoteWebDriver(new URL(huburl),cap);
         
         driver.get("http://www.facebook.com");
         System.out.println(driver.getTitle());
	}

}
