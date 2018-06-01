package com.finance;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import browserLaunchPrg.Finance.BasePage;

public class LoginValidation extends BasePage
{
	@FindBy(linkText="Sign in")WebElement signIn;
	@FindBy(id="email")WebElement email;


	
}
