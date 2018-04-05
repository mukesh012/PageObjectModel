package pages;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Google {

	@Test
	public void method() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		WebElement google  = driver.findElementByXPath("//input[@id=\"lst-ib\"]");
		google.sendKeys("cricket",Keys.ENTER);	
//		WebElement clicksearch = driver.findElementByName("btnK");
//		clicksearch.click();
		
		 //String source = driver.getPageSource();
		 List<WebElement> allLinkElements = driver.findElements(By.xpath("//*[contains(text(),'Cri')]"));
		 int linkListCount = allLinkElements.size();
		 System.out.println(linkListCount);
		 for (WebElement match : allLinkElements) {
			System.out.println(match.getText());
		    }

	}

}
