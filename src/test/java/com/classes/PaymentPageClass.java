package com.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class PaymentPageClass extends BaseClass {
	public PaymentPageClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cc_num")
	private WebElement ccNo;

	@FindBy(id="cc_type")
	private WebElement ccType;

	@FindBy(id="cc_exp_month")
	private WebElement expMonth;

	@FindBy(id="cc_exp_year")
	private WebElement expYear;

	@FindBy(id="cc_cvv")
	private WebElement ccvNo;

	@FindBy(id="book_now")
	private WebElement bookNowBtn;

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCcvNo() {
		return ccvNo;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	}



