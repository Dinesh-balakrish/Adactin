package com.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class DetailsClass extends BaseClass {
	public DetailsClass() {
		PageFactory.initElements(driver, this);
		}
		
		@FindBy(id="first_name")
		private WebElement fistName;
		
		@FindBy(id="last_name")
		private WebElement lastName;
		
		@FindBy(id="address")
		private WebElement address;

		public WebElement getFistName() {
			return fistName;
		}

		public WebElement getLastName() {
			return lastName;
		}

		public WebElement getAddress() {
			return address;
		}
		

	}



