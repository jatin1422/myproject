package com.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider2 {

	@Test(dataProvider="data")
	public void logintes(Object s) {
		System.out.println(s);
	}
	
	/*@DataProvider(name ="data")
	public Object[] data(){
		Object[] data = new Object[]{
				9,
				9,
				"khklas"
				
				
				
		};
	return data;
	}*/
	
	@DataProvider(name ="data",indices = {1,3})
	public Object[] data(){
		Object[] data = new Object[]{
				9,
				9,
				"khklas",
				78,
				89,
			"gknbkl",
				
		};
	return data;
	}
}
