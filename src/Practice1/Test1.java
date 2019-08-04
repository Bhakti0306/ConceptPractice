package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		//opening amazon website
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakuralove\\Desktop\\selenium dw\\chromedriver.exe");		
		WebDriver driver= new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		
		WebElement category= driver.findElement(By.id("nav-link-shopall"));
		
		category.click();
		Thread.sleep(5000);
		
	}

}
