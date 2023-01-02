import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import java.util.*;

public class windowPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathamesh\\Documents\\chromedriver_win32\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://the-internet.herokuapp.com/");
		
		//http://UserName:Password@SiteURL
		driver.get("http://admin:admin@the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Basic Auth")).click();
		System.out.println("Done");

		System.out.println("OK");
		System.out.println("Passed");
		
		
	}

}
