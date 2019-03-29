package stepDefinition;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Implementation {
	static  WebDriver driver;
	static Properties objectRepo;

@Given("^open the browser$")
public void open_the_browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	FileInputStream fis =new FileInputStream("C:\\Users\\NetWorkGiant\\git\\BDD\\BDD_Approach\\src\\objRepos\\ObjectRepository.properties");
	 objectRepo =new Properties();
	
	objectRepo.load(fis);
	
    System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
   driver =new ChromeDriver();
  
}

@When("^navigate to the url$")
public void navigate_to_the_url() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
 
	driver.get(objectRepo.getProperty("url"));
}

@When("^enter username$")
public void enter_username() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
	WebElement username =driver.findElement(By.xpath(objectRepo.getProperty("username")));
username.sendKeys("Tester");
}

@When("^enter password$")
public void enter_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
WebElement password=  driver.findElement(By.xpath(objectRepo.getProperty("password")));
password.sendKeys("test");
}

@When("^click login$")
public void click_login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	 driver.findElement(By.xpath(objectRepo.getProperty("login"))).click();;
	
   
}
@When("^click order$")
public void click_order() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	 driver.findElement(By.xpath("//*[@id='ctl00_menu']/li[3]/a")).click();;
	 
	
   
}
@When("^click dropdown$")
public void click_dropdown() {
	driver.findElement(By.xpath("//*[@id='ctl00_MainContent_fmwOrder_ddlProduct']")).sendKeys("FamilyAlbum");;
}

@When("^enter Quantity$")
public void enter_Quantity() {
	WebElement quantity =driver.findElement(By.xpath(objectRepo.getProperty("quantity")));
	quantity.sendKeys("5");
}

@When("^enter custName$")
public void enter_custName() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
WebElement custname=  driver.findElement(By.xpath(objectRepo.getProperty("custName")));
custname.sendKeys("Prasad");
}

@When("^enter street$")
public void enter_street() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
WebElement street=  driver.findElement(By.xpath(objectRepo.getProperty("street")));
street.sendKeys("Gandhi street");
}

@When("^enter city$")
public void enter_city() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
WebElement city=  driver.findElement(By.xpath(objectRepo.getProperty("city")));
city.sendKeys("Chennai");
}

@When("^enter state$")
public void enter_state() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
WebElement state=  driver.findElement(By.xpath(objectRepo.getProperty("state")));
state.sendKeys("Tamilnadu");
}

@When("^enter zip$")
public void enter_zip() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
WebElement zip=  driver.findElement(By.xpath(objectRepo.getProperty("zip")));
zip.sendKeys("909088");
}

@When("^click card$")
public void click_card() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	driver.findElement(By.xpath(objectRepo.getProperty("card"))).click();;
	 
	}
@When("^enter cardno$")
public void enter_cardno() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
WebElement cardno=  driver.findElement(By.xpath(objectRepo.getProperty("cardNr")));
cardno.sendKeys("7777777777787");
}

@When("^enter expdate$")
public void enter_expdate() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
WebElement expdate=  driver.findElement(By.xpath(objectRepo.getProperty("expdate")));
expdate.sendKeys("07/77");
}

@When("^click process$")
public void click_process() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	
	driver.findElement(By.xpath(objectRepo.getProperty("process"))).click();;
	 
	}




@Then("^click logout$")
public void click_logout() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath(objectRepo.getProperty("logout"))).click();;
{
	System.out.println("login is success ");
}
	
   
}


	



}
