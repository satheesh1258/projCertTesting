package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.*;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
	public  WebDriver getChromeCapabilities() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("no-sandbox");
//		option.addArguments("--headless");
		option.addArguments("--disable-dev-shm-usage");
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(option);
		  
		return driver;
	}
	@Test
	public void before() {
	
//		WebDriver driver = getChromeCapabilities();
		WebDriver driver = new ChromeDriver();
		// driver.get("https://localhost:8081/");
		driver.get("https://google.in"); 
		//we expect the title “Google “ should be present 
		String Expectedtitle = "Google";
		//it will fetch the actual title 
		String Actualtitle = driver.getTitle();
		System.out.println("Before Assetion " + Expectedtitle + Actualtitle);
		//it will compare actual title and expected title
		Assert.assertEquals(Actualtitle, Expectedtitle);
		//print out the result
		System.out.println("After Assertion " + Expectedtitle + Actualtitle + " Title matched ");
		 }
}
