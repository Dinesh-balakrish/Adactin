package com.classes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class HomePage extends BaseClass {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomType;


	@FindBy(xpath="//*[@id=\"room_nos\"]")
	private WebElement roomNo;
	
	@FindBy(id="datepick_in")
	private WebElement checkinDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkOut;
	
	@FindBy(id="adult_room")
	private WebElement adult;
	
	@FindBy(id="child_room")
	private WebElement child;
	
	@FindBy(id="Submit")
	private WebElement submitBtn;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getRoomNo() {
		return roomNo;
	}

	public WebElement getCheckinDate() {
		return checkinDate;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdult() {
		return adult;
	}

	public WebElement getChild() {
		return child;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	
	
	
	}
	




