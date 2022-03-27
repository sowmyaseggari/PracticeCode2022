package NewPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver1 {

	public static void main(String[] args) {
    
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		//driver.get("https://www.youtube.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}}


