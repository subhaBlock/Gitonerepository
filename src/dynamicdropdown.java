import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://corporate.spicejet.com/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
	//river.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement( By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		
		// /div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']
		// /div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		
		
		

	}

}
