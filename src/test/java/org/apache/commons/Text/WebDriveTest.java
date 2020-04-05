package org.apache.commons.Text;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriveTest {
	WebDriver driver;
	@Before
	public void before(){
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver_win32/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@Test
	public void test() {
		driver.get("https://www.baidu.com/");
		System.out.println(driver.getTitle());
		assertEquals("百度一下，你就知道",driver.getTitle());
	}
	
	@Test
	public void test2() {
		driver.get("https://www.baidu.com/");
		System.out.println(driver.findElement(By.cssSelector("input")));
	}
	
	@After
	public void after(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
}
