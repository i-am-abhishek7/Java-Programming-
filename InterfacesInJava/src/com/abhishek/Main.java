package com.abhishek;

public class Main {

    public static void main(String[] args) {
	    ITelephone aviPhone;
	    aviPhone = new DeskPhone(123456);
	    aviPhone.powerOn();
	    aviPhone.callPhone(123456);
	    aviPhone.isRinging();
	    aviPhone.answer();

	    aviPhone = new MobilePhone(24565);
	    aviPhone.powerOn();
	    aviPhone.callPhone(24565);
	    aviPhone.answer();
    }
}
