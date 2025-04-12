package TestScripts;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.elementrepository.Homepage;

public class Leavebutton extends BaseTest {
	
	
	@Test
	public void leaveButton() {
		
	Homepage homepage =new Homepage(driver);
	homepage.clickLeaveButton();
	}

}
