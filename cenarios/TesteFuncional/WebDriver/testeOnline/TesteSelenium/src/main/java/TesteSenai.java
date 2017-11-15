import java.sql.Driver;

import junit.framework.Assert;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;


public class TesteSenai {
	
	@Test
	public void testarTitulo() {
		System.setProperty("webdriver.chrome.driver", "/home/geltoncruz/Downloads/drivers/chromedriver");
//		WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.fieb.org.br/senai/");
		System.out.println(driver.getTitle());
		Assert.assertEquals("SENAI | Sistema Fieb", driver.getTitle());
		driver.close();
		driver.quit();	
	}	

}
