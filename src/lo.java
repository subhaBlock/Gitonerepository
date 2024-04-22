import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lo {

	public static void main(String[] args) throws InterruptedException {
		
		//implicit wait
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("Test");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());	
		
		driver.findElement(By.linkText("Forgot your password")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("frooty");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("email@mailinator.com");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
	}

}
