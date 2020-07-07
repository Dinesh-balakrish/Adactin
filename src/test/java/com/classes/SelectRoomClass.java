package com.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class SelectRoomClass extends BaseClass {
	public SelectRoomClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement rdoBtn;
	
	@FindBy(id="continue")
	private WebElement continueBtn;

	public WebElement getRdoBtn() {
		return rdoBtn;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	

}



