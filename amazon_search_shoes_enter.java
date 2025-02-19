//Searching and clicking on particular shoes on amazon website

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_search_shoes_enter 
{
	public static void main(String [] args)

	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			WebElement e1=driver.findElement(By.xpath("//input[@id= 'twotabsearchtextbox']"));
			e1.sendKeys("shoes");
			e1.sendKeys(Keys.ENTER);
			WebElement e2=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[20]"));
			e2.sendKeys(Keys.ENTER);
			
	
	}
}