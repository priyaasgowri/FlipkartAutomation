package org.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.utility.Baseclass;

import java.util.List;

public class searchresult extends Baseclass {
	public static void main(String[] args) throws InterruptedException {
		browserLaunch("chrome");

		urlLaunch("https://www.flipkart.com/");

		implicitWait(10);

		WebElement searchbox = driver.findElement(By.name("q"));
		searchbox.sendKeys("samsung mobile");
		searchbox.submit();

		System.out.println(driver.getTitle());

		Thread.sleep(3000);

		//  Get all product titles from the search results
		List<WebElement> productTitles = driver.findElements(By.cssSelector("[class ='KzDlHZ']"));

		//  Print each product title
		System.out.println("Product Titles on flipkart search results:");
		for (WebElement titleElement : productTitles) {
			System.out.println(titleElement.getText());

		}
		//  Get all product titles from the search results
		List<WebElement> productPrices = driver.findElements(By.cssSelector("[class='Nx9bqj _4b5DiR']"));

		//  Print each product title
		System.out.println("Product Prices on flipkart search results:");
		for (WebElement price : productPrices) {
			System.out.println(price.getText());

		}
		WebElement particularproducttitle=driver.findElement(By.cssSelector("[class ='KzDlHZ']"));
		System.out.println(" One particular item : " + particularproducttitle.getText());


	}
}
