package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchingBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranauv\\eclipse-workspace\\AdactinHotelMoreTC\\driver\\chromedriver.exe");
driver=new ChromeDriver();
		
	}
	public static void launchingApplication(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void sendKeys(WebElement webelement, String val) {
		webelement.sendKeys(val);
	}
	
	public static void click(WebElement a) {
		a.click();
	}
	public static void selectByIndex(WebElement webelement, int val) {
		Select s=new Select(webelement);
		s.selectByIndex(val);
		


	}
	
	public static void selectByValue(WebElement webelement, String val) {
		Select s=new Select(webelement);
		s.selectByValue(val);
		
		

	}
	
	public static void selectByVisibleText(WebElement webelement, String val) {
		Select s=new Select(webelement);
		s.selectByVisibleText(val);

	}
	public static void takeScreenShort() throws IOException {
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File desc = new File("C:\\Users\\pranauv\\eclipse-workspace\\AdactinHotelMoreTC\\TakesScreenShort\\img.PNG");
		FileUtils.copyFile(src, desc);
	}
	public static void getTexxt(WebElement webelement) {
		webelement.getText();
		
		
	}
	public static void close() {
		driver.close();

	}
}
