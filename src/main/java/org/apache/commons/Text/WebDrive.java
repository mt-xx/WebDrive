package org.apache.commons.Text;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrive {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "F:/chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.baidu.com/");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
