package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindElement_Class 

{
	public static void main (String[] args)
	{
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1= driver.findElement(By.name("q"));
		e1.sendKeys("Ravi"+Keys.ENTER);
	}

}
