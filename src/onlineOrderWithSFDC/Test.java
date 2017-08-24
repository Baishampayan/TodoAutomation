package onlineOrderWithSFDC;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Test {
	
	static WebDriver wd;

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\591211\\Desktop\\WP\\Driver\\chromedriver.exe");

		wd = new ChromeDriver();

		wd.get("http://todomvc.com/examples/react/#/");

		wd.manage().window().maximize();
		
		Thread.sleep(5000);
		
		WebElement e1 = wd.findElement(By.xpath("html/body/section/div/header/input[@class='new-todo']"));
		
		e1.sendKeys("abc");
		
		Robot rb = new Robot();
		
		rb.keyPress(KeyEvent.VK_ENTER);

	}

}
