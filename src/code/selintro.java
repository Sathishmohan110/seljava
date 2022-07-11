package code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selintro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sathi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
driver.get("https://www.google.com/intl/en-GB/gmail/about/");
driver.findElement(By.linkText("Sign in")).click();
driver.findElement(By.name("identifier")).sendKeys("sathishmohan110@gmail.com");
// this is summa edit on the git 
driver.findElement(By.className("VfPpkd-RLmnJb")).click();
	}

}
