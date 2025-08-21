package appium_testing;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Actions extends parameters {
	
	public void setCapability() {
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "MyPhone");
		caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + File.separator + "apps"+ File.separator +"calculator.apk");
		
	}
	
	public void createANewInstance() throws MalformedURLException{
		var appiumServerUrl = URI.create("http://127.0.0.1:4723/wd/hub").toURL();
		 driver = new AndroidDriver(appiumServerUrl , caps);
	}
	
	
	public void clear() {
		driver.findElement(By.id("com.google.android.calculator:id/clr")).click();
	}
	public void addTwoNumbers(String num1 , String num2) {
		if(num1 == null || num2==null) {
			System.out.println("Don't use null values");
		}
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_add")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	}
	
	public void subtractionOfTwoNumbers(String num1 , String num2) {
		if(num1 == null || num2==null) {
			System.out.println("Don't use null values");
		}
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_sub")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	}
	
	public void multiplicationOfTwoNumbers(String num1 , String num2) {
		if(num1 == null || num2==null) {
			System.out.println("Don't use null values");
		}
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	}
	
	public void sqrtOfNumber(String num) {
		if(num == null ) {
			System.out.println("Don't use null values");
		}
		driver.findElement(By.id("com.google.android.calculator:id/op_sqrt")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+num)).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	}
	
	
	public void powerOfTwoNumbers(String num1 , String num2) {
		if(num1 == null || num2==null) {
			System.out.println("Don't use null values");
		}
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+num1)).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_pow")).click();
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+num2)).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	}
	
	public void FactorialOfNumber(String num) {
		if(num == null ) {
			System.out.println("Don't use null values");
		}
		
		driver.findElement(By.id("com.google.android.calculator:id/digit_"+num)).click();
		driver.findElement(By.id("com.google.android.calculator:id/op_fact")).click();
		driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
	}
	public void takeScreenShot() {
	    TakesScreenshot ts = (TakesScreenshot) driver;
		
	    Date currentDate = new Date();
	    String actualDate = currentDate.toString().replace(":", "-");
	    Random randomNumber = new Random();
	    int number = randomNumber.nextInt(1000);
	    
		File source = ts.getScreenshotAs(OutputType.FILE);
        String destinationpath = System.getProperty("user.dir") + File.separator + "screenshots" + 
		File.separator + actualDate + "_"+ number + ".png";
	
        File finalDestination = new File(destinationpath);
        
		try {
			FileUtils.copyFile(source, finalDestination);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void closeApp() {
		driver.close();
	}
}
