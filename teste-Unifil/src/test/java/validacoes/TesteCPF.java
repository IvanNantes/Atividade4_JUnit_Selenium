package validacoes;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteCPF {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void testeCPF() {
		driver.get("https://portal.unifil.br/");
		driver.manage().window().setSize(new Dimension(612, 769));
		driver.findElement(By.id("IDLoginL")).click();
		js.executeScript("window.scrollTo(0,212)");
		driver.findElement(By.id("IDLoginL")).sendKeys("111.449.569-78");
		driver.findElement(By.cssSelector(".btn-dark")).click();
	}
}
