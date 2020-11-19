package projecttask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mani KDM\\eclipse-workspace\\project\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.id("username"));
user.sendKeys("karthi007");

WebElement pass = driver.findElement(By.id("password"));
pass.sendKeys("Karthi@1989");

WebElement log = driver.findElement(By.id("login"));
log.click();

WebElement loc = driver.findElement(By.id("location"));
loc.click();

Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);


WebElement hotname = driver.findElement(By.id("hotels"));
hotname.click();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

WebElement roomtye = driver.findElement(By.id("room_type"));
roomtye.click();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

WebElement room = driver.findElement(By.id("room_nos"));
room.click();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);


WebElement adult = driver.findElement(By.id("adult_room"));
adult.click();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

WebElement child = driver.findElement(By.id("child_room"));
child.click();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

WebElement srh = driver.findElement(By.id("Submit"));
srh.click();

WebElement rdo = driver.findElement(By.id("radiobutton_0"));
rdo.click();

WebElement cntnu = driver.findElement(By.id("continue"));
cntnu.click();

WebElement fname = driver.findElement(By.id("first_name"));
fname.sendKeys("bala");
Thread.sleep(3000);

WebElement lname = driver.findElement(By.id("last_name"));
lname.sendKeys("sai");


WebElement address = driver.findElement(By.id("address"));
address.sendKeys("23,omr road,chennai");


WebElement card = driver.findElement(By.id("cc_num"));
card.sendKeys("12343455666777777777788");

WebElement ctye = driver.findElement(By.id("cc_type"));
ctye.click();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);



WebElement selmonth = driver.findElement(By.id("cc_exp_month"));
selmonth.click();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);

WebElement year = driver.findElement(By.id("cc_exp_year"));
year.click();

r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);


WebElement cvv = driver.findElement(By.id("cc_cvv"));
cvv.sendKeys("123");

WebElement book = driver.findElement(By.id("book_now"));
book.click();


JavascriptExecutor js=(JavascriptExecutor)driver;
WebElement ornum = driver.findElement(By.id("order_no"));
Object o = js.executeScript("returnarguments[0].getattribute9('value')", ornum);
System.out.println(o);









	
	
	}

}
