package Try;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import Files.Driver;
import org.openqa.selenium.support.FindBy;

public class FacebookTry {

	@FindBy (id="email")
	private WebElement Username;
	
	@FindBy (id="pass")
	private WebElement Password;
	
	@FindBy	(id="u_0_v")
	private WebElement OkButton;
	
	public boolean ValidarFacebookPage(){
		try{
			Assert.assertEquals(Driver.driver.getTitle(),"Facebook","Facebook Failed");
		}catch(Exception e){
		return false;	
		}
		return true;
	}
	public boolean loginFacebook(String username, String password){
		try{
			Username.clear();
			Username.sendKeys(username);
			Password.clear();
			Password.sendKeys(password);
			OkButton.click();
		}
	catch(Exception e){
		return false;
	}
	return true;
	}
}
