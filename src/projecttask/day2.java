package projecttask;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani KDM\\eclipse-workspace\\project\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement srh = driver.findElement(By.id("twotabsearchtextbox"));
		srh.sendKeys("hp laptop");
		WebElement srhbut = driver.findElement(By.id("nav-search-submit-text"));
		srhbut.click();
		
		list <l=new arraylist
		
		list <WebElement>detail = driver.findElement(By.className("a-size-medium a-color-base a-text-normal"));
		
		for (String detail : x)
		System.out.println(x);
		
		{
			
		}
		String text = detail.getText();
		System.out.println(text);
		
		

}}
