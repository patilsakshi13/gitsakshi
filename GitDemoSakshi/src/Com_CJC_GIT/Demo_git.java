package Com_CJC_GIT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_git 
{
	
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\Seleniunm\\exe\\chromedriver.exe");
		driver.get("https://github.com/patilsakshi13/gitsakshi/tree/master/GitDemoSakshi");
		
	}
}
