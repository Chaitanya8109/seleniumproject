package TestScripts;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.elementrepository.Homepage;

public class UpgradeButton extends BaseTest {

	
	@Test
	public void updgradebutton() {
		
		Homepage homepage =new Homepage(driver);
		homepage.clickUpgradeButton();
	}
}
