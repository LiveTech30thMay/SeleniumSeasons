package aug9th;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinApp {
	
	@BeforeMethod
	public void setUp()
	{
		System.out.println("browser started ..");
		System.out.println("App launched..");
		
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("browser closed ..");
	}
	
	@Test(priority=1)
	public void validateLoginTest()
	{
		
		System.out.println("Login test successfull..");
		Assert.assertTrue(true);
		
	}
	
	@Test(priority=0)
	public void validateRegistrationTest()
	{
		
		System.out.println("Registration test successfull..");
		
	}
	
	@Test(priority=2)
	public void validateForgotPasswordTest()
	{
		
		System.out.println("Forgotpassword test successfull..");
		
	}
	
	@Test(priority=3,dependsOnMethods={"validateLoginTest","validateRegistrationTest"})
	public void validateChangePasswordTest()
	{
		
		System.out.println("Change Password test successfull..");
		
	}
	

}
