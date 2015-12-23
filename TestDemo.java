package com.Maven.ProjectMaven;

import Files.Driver;
import Files.commUtil;
import org.openqa.selenium.support.PageFactory;
import Try.FacebookTry;

public class TestDemo {

	public static void main(String[] args) {
		
		Driver.driver = Driver.browser("firefox"); 
		commUtil.launchBrowser("https://www.facebook.com/?_rdr=p");
		FacebookTry Login = PageFactory.initElements(Driver.driver, FacebookTry.class);
		Login.ValidarFacebookPage();
		Login.loginFacebook("username@gmail.com", "password1");		
		
	}

}
