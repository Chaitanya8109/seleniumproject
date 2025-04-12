package TestScripts;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.elementrepository.Homepage;

public class Userbutton extends BaseTest {
	
	
	@Test
	public void userbutton() {
		
		Homepage homepage =new Homepage(driver);
		homepage.clickUserButton();
	}

}
