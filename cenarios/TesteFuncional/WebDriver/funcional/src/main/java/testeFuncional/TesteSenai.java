package testeFuncional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteSenai {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "/home/geltoncruz/Documents/aulas/Testes-de-Software/cenarios/Driver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.senai.fieb,br");
		System.out.println(driver.getTitle());
	}
	
}