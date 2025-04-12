package TestScripts;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.elementrepository.Homepage;

public class Pimbutton extends BaseTest {
	
	
	@Test
	public void pimbutton() {
		Homepage homepage =new Homepage(driver);
		homepage.clickpimButton();
		
	}

}
