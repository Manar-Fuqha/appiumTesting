package appium_testing;

import java.net.MalformedURLException;

import org.testng.annotations.*;
public class mathematicalCalculations {

	Actions action = new Actions();
	
	@BeforeTest
	public void setup() throws MalformedURLException {
		action.setCapability();
		action.createANewInstance();
	}
	
	@Test (description="Addition of two numbers Functionality")
	public void addition() {
		action.addTwoNumbers("5", "4");
		action.takeScreenShot();
	}
	
	@Test (description="Subtraction of two numbers Functionality")
	public void subtraction() throws MalformedURLException, InterruptedException {
		Thread.sleep(1000);
		action.clear();
		action.subtractionOfTwoNumbers("9", "5");
		action.takeScreenShot();
	}
	
	@Test (description="multiplication of two numbers")
	public void multiplication() throws InterruptedException {
		Thread.sleep(1000);
		action.clear();
		action.multiplicationOfTwoNumbers("7", "3");
		action.takeScreenShot();
	}
	
	@Test
	public void sqrt() throws InterruptedException{
		Thread.sleep(1000);
		action.clear();
		action.sqrtOfNumber("9");
		action.takeScreenShot();
	}
	
	@Test
	 public void powerOfTwoNumbers() throws InterruptedException {
		 Thread.sleep(1000);
		 action.clear();
		 action.powerOfTwoNumbers("2", "3");
		 action.takeScreenShot();
	 }
	 
	@Test
	 public void factorialOfAnyNumber() throws InterruptedException {
		 Thread.sleep(1000);
		 action.clear();
		 action.FactorialOfNumber("3");
		 action.takeScreenShot();
	 }
	
	
	@AfterTest
	public void myAfterTest() {
		action.closeApp();
	}
}
