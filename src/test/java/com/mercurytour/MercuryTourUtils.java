package com.mercurytour;

import java.io.File;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MercuryTourUtils {
	
	public static WebDriver driver;

	public void initiateBrowser() {
		String baseDir = System.getProperty("user.dir");
		String firefoxDriverPath = baseDir + File.separator + "src" + File.separator + "test" + File.separator
				+ "drivers" + File.separator + "geckodriver.exe";
		//System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
		driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
	}
	
	
	public static void clearAndEnterText(String objectProperty, String Text) {
		try {
			System.out.println(objectProperty);
			System.out.println("Text Value is=" +Text);
			WebElement textBox = getElementByProperty(objectProperty,
					driver);
			System.out.println("element===> " + textBox);
			textBox.clear();
			Thread.sleep(2000);
			System.out.println("Text box element=" +textBox);
			textBox.sendKeys(Text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static WebElement getElementByProperty(String objectProperty,
			WebDriver webDriver) {
		String propertyType = null;
		WebElement element = null;
		try {
			WebDriverWait browserWithElementWait = new WebDriverWait(webDriver, 30);
			propertyType = StringUtils.substringAfter(objectProperty, "~");
			objectProperty = StringUtils.substringBefore(objectProperty, "~");
			element = browserWithElementWait.until(ExpectedConditions
						.presenceOfElementLocated(By.xpath(objectProperty)));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return element;
	}
	
	public static void isElementPresentVerifyClick(String objectProperty) {
		WebDriverWait webDriverWait = new WebDriverWait(driver, 30);
		try {
			WebElement element = getElementByProperty(objectProperty, driver);
			if (element != null) {
				element.click();
			} else {
				throw new Exception("Object Couldn't be retrieved and clicked");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
