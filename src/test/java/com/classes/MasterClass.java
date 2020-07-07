package com.classes;

import com.baseclass.BaseClass;

public class MasterClass extends BaseClass {
	
	
	private LoginPage loginPage;
	private HomePage homePage;
	private SelectRoomClass selectRoomClass;
	private DetailsClass detailsClass;
	private PaymentPageClass paymentPageClass;

	public LoginPage getLoginPage() {
		return (loginPage==null)? loginPage=new LoginPage(): loginPage;
	}
	public HomePage getHomePage() {
		return (homePage==null)?homePage=new HomePage():homePage;
	}
	public SelectRoomClass getSelectRoomClass() {
		return (selectRoomClass==null)? selectRoomClass=new SelectRoomClass():selectRoomClass;
	}
	public DetailsClass getDetailsClass() {
		return (detailsClass==null)? detailsClass=new DetailsClass():detailsClass;
	}
	public PaymentPageClass getPaymentPageClass() {
		return (paymentPageClass==null)?paymentPageClass=new PaymentPageClass():paymentPageClass;
				
	}
}
