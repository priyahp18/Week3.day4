package Week3.day4;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		//open the URL
		driver.get("https://www.ajio.com/");
		//Max the window
		driver.manage().window().maximize();
		//type bag and search
		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.className("ic-search")).click();
		//Gender-Men
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		//click on fashion bag
		WebElement obj = driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]"));
		obj.click();
		//print count
		System.out.println(obj.getText());
		//print count
		List<WebElement> result = driver.findElements(By.xpath("//span[@class='price  ']"));
		List<String> Priceresult = new ArrayList<String>();
		for (int i=0;i<result.size();i++) {
			WebElement price = result.get(i);
			String price1 = price.getText();
			Priceresult.add(price1);
			System.out.println(price1);
		}
		
	}

}
