package com.stepdefinitionclass;

import java.io.IOException;

import com.baseclass.BaseClass;
import com.classes.DetailsClass;
import com.classes.HomePage;
import com.classes.LoginPage;
import com.classes.MasterClass;
import com.classes.PaymentPageClass;
import com.classes.SelectRoomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class StepdefinitionClass extends BaseClass {
	
	MasterClass masterClass;
	LoginPage loginPage;
	HomePage homePage;
	SelectRoomClass selectRoomClass;
	DetailsClass detailsClass;
	PaymentPageClass paymentPageClass;
	
	@Given("user should enter {string},{string}")
	public void user_should_enter(String username, String password) {
		masterClass=new MasterClass();
		loginPage=masterClass.getLoginPage();
		sendKeys(loginPage.getUserName(), username);
		sendKeys(loginPage.getPassword(), password);
		click(loginPage.getLoginBtn());
				
	   
	}

	@When("user should select rooms {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_select_rooms(String Location, String Hotels, String RoomType, String NumberofRooms, String CheckInDate, String CheckOutDate, String AdultsperRoom, String ChildrenperRoom) {
		 masterClass=new MasterClass();
		   homePage=masterClass.getHomePage();
		   selectByVisibleText(homePage.getLocation(), Location);
		   selectByVisibleText(homePage.getHotel(), Hotels);
		   selectByVisibleText(homePage.getRoomType(), RoomType);
		   selectByValue(homePage.getRoomNo(),NumberofRooms );
		   sendKeys(homePage.getCheckinDate(), CheckInDate);
		   sendKeys(homePage.getCheckOut(), CheckOutDate);
		   selectByValue(homePage.getAdult(), AdultsperRoom);
		   selectByValue(homePage.getChild(), ChildrenperRoom);
		   click(homePage.getSubmitBtn());
		   selectRoomClass=masterClass.getSelectRoomClass();
		   click(selectRoomClass.getRdoBtn());
		   click(selectRoomClass.getContinueBtn());
	}

	@When("user should given personal details{string},{string},{string}")
	public void user_should_given_personal_details(String FirstName, String LastName, String BillingAddress) {
		masterClass=new MasterClass();
		detailsClass=masterClass.getDetailsClass();
		sendKeys(detailsClass.getFistName(), FirstName);
		sendKeys(detailsClass.getLastName(), LastName);
		sendKeys(detailsClass.getAddress(), BillingAddress);
		
	}
	


	@When("user should given cc details{string},{string},{string},{string},{string}")
	public void user_should_given_cc_details(String CreditCardNo, String CreditCardType, String ExpiryMonth, String ExpiryYear, String CVVNumber) {
		masterClass=new MasterClass();
	    paymentPageClass=masterClass.getPaymentPageClass();
	    sendKeys(paymentPageClass.getCcNo(), CreditCardNo);
	    selectByValue(paymentPageClass.getCcType(), CreditCardType);
	    selectByValue(paymentPageClass.getExpMonth(), ExpiryMonth);
	    selectByValue(paymentPageClass.getExpYear(), ExpiryYear);
	    sendKeys(paymentPageClass.getCcvNo(), CVVNumber);
	    click(paymentPageClass.getBookNowBtn());
	}

	@Then("user get conform message")
	public void user_get_conform_message() throws IOException {
		Assert.assertTrue(true);
		takeScreenShort();  
		driver.close();
	}

	@Then("user should cancel booking")
	public void user_should_cancel_booking() {
		Assert.assertTrue(true);
	}



}
