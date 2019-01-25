package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComputerModelTest {

	@Test
	public void test() {
		/*
		 * First we load our driver, in this case Chrome, that it is in the follower location
		 */
		String exePath = ".\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver chrome = new ChromeDriver();
		/*
		 * Then, we go to our test website
		 */
		chrome.get("http://computer-database.gatling.io/computers");
		/*
		 * First we want to add a new computer
		 */
		chrome.findElement(By.id("add")).click();
		chrome.findElement(By.id("name")).sendKeys("New_Computer");
		chrome.findElement(By.id("introduced")).sendKeys("2019-01-25");
		chrome.findElement(By.id("discontinued")).sendKeys("2019-01-26");
		chrome.findElement(By.cssSelector("Input[class*='btn primary'")).click();
		/*
		 * After added our computer, we want to search the computer added
		 */
		chrome.findElement(By.id("searchbox")).sendKeys("New_Computer");
		chrome.findElement(By.id("searchsubmit")).click();
		/*
		 * Searched, now we want to delete it
		 */
		chrome.findElement(By.xpath("//*[@id=\"main\"]/table/tbody/tr/td[1]/a")).click(); //In theory, only this model will be the only one, so we have to select the computer it appears
		chrome.findElement(By.cssSelector("Input[class*='btn danger'")).click();
		/*
		 * Finally, we close our browser
		 */
		chrome.close();
	}

}
