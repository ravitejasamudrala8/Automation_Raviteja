//Searching and clicking on particular shoes on amazon website

package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon_search_shoes_enter_navigate 
{
	public static void main(String [] args)

	{
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in");
			driver.manage().window().maximize();
			WebElement e1=driver.findElement(By.xpath("//input[@id= 'twotabsearchtextbox']"));
			e1.sendKeys("shoes");
			e1.sendKeys(Keys.ENTER);
			WebElement e2=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
			e2.click();
		
			WebElement e3=driver.findElement(By.xpath("//input[@id= 'twotabsearchtextbox']"));
			e3.clear();
			e3.sendKeys("shoes");
			e3.sendKeys(Keys.ENTER);
			WebElement e4=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[2]"));
			e4.click();
			e4.getLocation();
				System.out.println(e4);
			driver.navigate().back();
			
	
	}
}