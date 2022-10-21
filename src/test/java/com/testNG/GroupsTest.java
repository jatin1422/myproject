package com.testNG;

import org.testng.annotations.Test;

public class GroupsTest{

	@Test(groups="smoke")
	void login() {
		
		System.out.println("smoke");
		
		
	}
	
	@Test(groups={"regression","sanity"})
	void login2() {
		
		System.out.println("regression");
		
		
	}
	
	@Test(groups="sanity")
	void login3() {
		
		System.out.println("sanity");
		
		
	}
	
	
	
}
