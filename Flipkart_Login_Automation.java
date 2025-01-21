package Javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Login_Automation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Projects\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("8652112284");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Request OTP']")).click();
		Thread.sleep(2000);
		String Otp="436223";
		driver.findElement(By.xpath("//input[@class='r4vIwl IX3CMV']")).sendKeys(Otp);
		driver.findElement(By.xpath("//a[text()='Verify']")).click();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"))).perform();
		
		
		/*
		 //span[normalize-space()='Login']
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='email']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='pass']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='u_0_5_2p']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Forgotten password?']")).click();
		*/
	}
}