package com.hatbazar.onlineshopping.service;

public class UserRegistrationService {
	
	public void addNewUser(String emailid) {
		boolean isUserPresent=isUserPresentinDB(emailid);
	}

	private boolean isUserPresentinDB(String emailid) {
		// check user present in db or not here
		return false;
	}
	
}
