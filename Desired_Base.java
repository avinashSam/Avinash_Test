package com.glyd.qa.base;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Desired_Base{
		public static void main(String[] args) {
			
		
			
				
				//Set the Desired Capabilities
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setCapability("deviceName", "moto g6");
				caps.setCapability("udid", "ZF62235Q6H"); //Give Device ID of your mobile phone
				caps.setCapability("platformName", "Android");
				caps.setCapability("platformVersion", "8.0.0");
				caps.setCapability("appPackage", "com.android.vending");
				caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
				caps.setCapability("noReset", "true");
				
				//Instantiate Appium Driver
				try {
						AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>
						(new URL("http://0.0.0.0:4723/wd/hub"), caps);
					
				} catch (MalformedURLException e) {
					System.out.println(e.getMessage());
	}}}


