package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public static void login(WebDriver driver, String username, String password)
{
		WebElement user1= driver.findElement(By.name("userName"));
		user1.sendKeys(username);
		
		WebElement password1= driver.findElement(By.name("password"));
		password1.sendKeys(password);
		
		WebElement signUp= driver.findElement(By.name("login"));
		signUp.click();
		
}

	
}
