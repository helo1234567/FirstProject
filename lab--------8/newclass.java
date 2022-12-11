package Trello_Task;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newclass {

	WebDriver driver;
	Object_Class object=new Object_Class(driver);
	
	@BeforeMethod
	public void main()throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://trello.com");
		driver.manage().window().maximize();
		String alphbates="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 StringBuilder sb = new StringBuilder();
		    Random random = new Random();
		    int length=7;
		    for (int i = 0; i < length; i++) {
		    	int index=random.nextInt(alphbates.length());
		    	char randomChar=alphbates.charAt(index);
		    	sb.append(randomChar);
	 }
		String randomstring=sb.toString();
		newclass asad=new newclass();
		asad.Before_method();
		asad.Before_method12(randomstring);
		

	}
	@Test(priority=0)
	public void Before_method() throws InterruptedException {
		
		object.login();
		
	}
	
	
	@Test(priority=1)
public void Before_method12(String randomstring ) {
		
		
		object.CreateBoard(randomstring);
	}
	

}
