import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileDownload {

	public void getdata()
	{
		
		System.out.println("OK1");
		System.out.println("Yes");
		System.out.println("Yes1");
	}
	
	public void getdata2()
	{
		
		System.out.println("Yes5");
		System.out.println("Yes5");
	}
	
public static void main(String[] args) throws InterruptedException, IOException {
// TODO Auto-generated method stub


	
	String downloadPath=System.getProperty("user.dir");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prathamesh\\Documents\\chromedriver_win32\\chromedriver.exe"); 
	
	HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	chromePrefs.put("profile.default_content_settings.popups", 0);
	chromePrefs.put("download.default_directory", downloadPath);

	ChromeOptions options=new ChromeOptions();
	options.setExperimentalOption("prefs", chromePrefs);

	WebDriver driver=new ChromeDriver(options);
	driver.manage().window().maximize();

	driver.get("https://www.ilovepdf.com/pdf_to_jpg");
	driver.findElement(By.id("pickfiles")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Visit\\Autoit1.exe");

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#processTask")));

	driver.findElement(By.cssSelector("#processTask")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#pickfiles")));
	driver.findElement(By.cssSelector("#pickfiles")).click();
	Thread.sleep(10000);

	File f=new File(downloadPath+"/ilovepdf_pages-to-jpg.zip");
		if(f.exists())
		{
			Assert.assertTrue(f.exists());
			if(f.delete())
				System.out.println("file deleted");
				System.out.println("file Absent");
				System.out.println("file Remove");
				
				System.out.println("file AB");
				System.out.println("file RM");
		}
	}
}