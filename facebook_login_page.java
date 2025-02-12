package Selenium_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class facebook_login_page 
{
	public static void main(String [] args)

	{
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");
		WebElement name1 = driver.findElement(By.id("email"));
		name1.sendKeys("ravitejasamudrala@gmail.com");
		WebElement name2 = driver.findElement(By.id("pass"));
		name2.sendKeys("1234");
		WebElement nameloginbutton= driver.findElement(By.id("loginbutton"));
		nameloginbutton.sendKeys(Keys.ENTER);
	}
}