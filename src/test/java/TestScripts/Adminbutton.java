package TestScripts;


import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.elementrepository.Homepage;

public class Adminbutton extends BaseTest {

	@Test
public void adminbutton() {
		
		Homepage homepage =new Homepage(driver);
		homepage.clickAdminButton();
	}
}
