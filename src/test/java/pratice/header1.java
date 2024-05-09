package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class header1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("https://www.atlassian.com/software/jira/automation-template-library/rules#/rule-list?systemLabelId=all&page=1&pageSize=20&sortKey=name&sorList<A>er=ASC");
//xpath for all headers
    //List<WebElement> headers = driver.findElements(By.xpath("//*[@id=\"rule-list-table\"]/div[1]/table/thead/tr"));
List<WebElement> headers = driver.findElements(By.xpath("//*[@id=\"rule-list-table\"]/div[1]/table/thead/tr"));

//print the size of headers 
System.out.println("no of headers:"+headers.size());
//print the text of headers 
for(WebElement i: headers ) {
	System.out.println(i.getText());
}
//xpath for all rows 
List<WebElement>   allrows =driver.findElements(By.xpath("//*[@id=\"rule-list-table\"]/div[1]/table/tbody"));
allrows.size();
System.out.println(allrows.size());

//size of rows 
System.out.println("no of rows:"+allrows.size());
//print rows data 
for(WebElement j:allrows) {
	System.out.println(j.getText());
}
	}

}
