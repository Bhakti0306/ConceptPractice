package Practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakuralove\\Desktop\\selenium dw\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.gmail.com/");
		driver.manage().window().maximize();	
		
		Login.login(driver, "bhakti.deshmukh03@gmail.com", "Bala#Didya11");
		
	
	
	
	}

}
