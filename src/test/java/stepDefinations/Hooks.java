package stepDefinations;

import Cucumber.Automation.Base;
import io.cucumber.java.After;

public class Hooks extends Base{
	
	@After("@SeleniumTest")
		public void AfterSeleniumTest() {
		
		driver.close();
		
	}
	

}
