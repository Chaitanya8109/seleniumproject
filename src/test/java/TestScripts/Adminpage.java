package TestScripts;

import org.testng.annotations.Test;

import com.automation.base.BaseTest;
import com.automation.elementrepository.AdminPage;

public class Adminpage extends BaseTest {

	
	@Test
	public void adminPage() {
		
		AdminPage Acp =new AdminPage(driver);
		Acp.clickAdminButton();
		Acp.userName();
		Acp.name();
		
		
		
		
	}
	
}
