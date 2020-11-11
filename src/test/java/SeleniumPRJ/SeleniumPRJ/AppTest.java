package SeleniumPRJ.SeleniumPRJ;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Project.App;
//import org.testng.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void before() {
	App ap = new App();
//		WebDriver driver = getChromeCapabilities();
		WebDriver driver =  ap.getChromeCapabilities();
		// driver.get("https://localhost:8081/");
		driver.get("https://www.google.co.in/?gws_rd=ssl"); 
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
