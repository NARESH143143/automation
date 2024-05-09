package vtigerpratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("http://localhost:8888/");
		//xapth for un 
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div[4]/input")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"submitButton\"]")).click();
		//System.out.println(driver.getTitle());
		String exptitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		String actitle=driver.getTitle();
		if(actitle.equals(exptitle)) {
			System.out.println("if executed");
		}
		else {
			System.out.println("else not executed");
		}
	}

}
