package aug8th;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AdactinApp {
	
	@Test(priority=1)
	public void validateLoginTest()
	{
		System.out.println("browser started ..");
		System.out.println("App launched..");
		System.out.println("Login test successfull..");
		Assert.assertTrue(true);
		System.out.println("browser closed ..");
	}
	
	@Test(priority=0)
	public void validateRegistrationTest()
	{
		System.out.println("browser started ..");
		System.out.println("App launched..");
		System.out.println("Registration test successfull..");
		System.out.println("browser closed ..");
	}
	
	@Test(priority=2)
	public void validateForgotPasswordTest()
	{
		System.out.println("browser started ..");
		System.out.println("App launched..");
		System.out.println("Forgotpassword test successfull..");
		System.out.println("browser closed ..");
	}
	
	@Test(priority=3,dependsOnMethods={"validateLoginTest","validateRegistrationTest"})
	public void validateChangePasswordTest()
	{
		System.out.println("browser started ..");
		System.out.println("App launched..");
		System.out.println("Change Password test successfull..");
		System.out.println("browser closed ..");
	}
	

}
