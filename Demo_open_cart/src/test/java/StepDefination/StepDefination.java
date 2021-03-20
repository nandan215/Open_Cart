package StepDefination;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.LogManager;

//import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;
//import StepDefination.MyBase;


public class StepDefination extends MyBase {
	public static Properties pro;
	//@Before(order=2)
	//public void setbrowser(Scenario sc)
	//{
		//String scenarioname=sc.getName();
		//System.out.println(scenarioname);
		
	//}
	/*@BeforeStep
	public void takescreenshot()
	{
		
	}
	
	@AfterStep
	public void setupbrow()
	{
		
	}*/
	
	@Before(order=1)
	public void setup() throws IOException
	{
		System.out.println("i am Before hook###############");
		
		/* Rdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
       Minelogger=  org.apache.logging.log4j.LogManager.getLogger("StepDefination");
      
      
          pro =new Properties();
          FileInputStream fis= new FileInputStream("E://Demo_OpenCart//Configuration//Config.properties");
          pro.load(fis);
		
		 String br=pro.getProperty("browser");
		 if(br.equals("chrome"))
		 {
			 System.setProperty("webdriver.chrome.driver", "E://Demo_OpenCart//Drivers//chromedriver.exe");
			 Rdriver = new ChromeDriver(); 
		 }
		 else if(br.equals("firefox"))
		 {
			 
		 }
		 else if(br.equals("ie"))
		 {
			 
		 }*/
		
	}
	


@Given("^Launch the Application$")
public void launch_the_Application() throws Throwable {
   
	System.out.println("launch the application test step");
	 /*Minelogger.info("Iam launching the browser");
    Rdriver.get(pro.getProperty("baseURL"));
   
    Rdriver.manage().window().maximize();*/
   
}

@Then("^click on'My Account'Drop menu$")
public void click_on_My_Account_Drop_menu() throws Throwable {
	
	/* Thread.sleep(1000);
	 Minelogger.info("click on account");
	Rdriver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();*/
  
   
}

@Then("^click on'Register 'option$")
public void click_on_Register_option() throws Throwable {
	 System.out.println("click on register option");
  /*Rdriver.findElement(By.linkText("Register")).click();
  Minelogger.info("");*/
  
  
}

@Then("^Enter new Account Details into the mandatory fields with the following details$")
public void enter_new_Account_Details_into_the_mandatory_fields_with_the_following_details(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	/* System.out.println("enter the mandatory fields");
	 List<List<String>> data=arg1.raw();
    Rdriver.findElement(By.id("input-firstname")).sendKeys(data.get(0).get(0));
    Rdriver.findElement(By.id("input-lastname")).sendKeys(data.get(0).get(1));*/
}

@Then("^click on continue button$")
public void click_on_continue_button() throws Throwable {
	 System.out.println("click on continue");
    
}

@Then("^click on continue button that is displayed in the Account Succes$")
public void click_on_continue_button_that_is_displayed_in_the_Account_Succes() throws Throwable {
	 System.out.println("click on continue button that is displayed in the account Success");
    
}

@Then("^Enter new Account Details into the mandatory fields\\(First name ,Last Name etc\\)$")
public void enter_new_Account_Details_into_the_mandatory_fields_First_name_Last_Name_etc(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	 System.out.println("enter a new acounts 2");
    
}

@Then("^check the email adress used for registering the account$")
public void check_the_email_adress_used_for_registering_the_account() throws Throwable {
	 System.out.println("check the email adress used for registering");
   
}

@Then("^click on the Login Page link from the email body$")
public void click_on_the_Login_Page_link_from_the_email_body() throws Throwable {
	 System.out.println("click onloginpage link from the email body");
    
}

@Given("^given i am background$")
public void given_i_am_background() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("i am the background@@@@@@@@@@");
}

@Given("^i am scenario no one$")
public void i_am_scenario_no_one() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("i am scenario 1");
}

@Given("^i am scenario no two$")
public void i_am_scenario_no_two() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("i am scenario 2");
   
}





}
