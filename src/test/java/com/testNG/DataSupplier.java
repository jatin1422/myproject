package com.testNG;

import org.testng.annotations.DataProvider;

public class DataSupplier {
 //provide to Dataprovide

	  @DataProvider(name ="logindata")
	  public Object[][] login_data() throws Exception{
		  
		  String path2 ="C:\\SelinumWebdriver\\EXCELFILES\\ur.xlsx";
		  
		  XLUtility util = new XLUtility(path2);
		  int rows = util.getRowCount("sheet1");
		  int cols = util.getCellCount("sheet1", 1);
		  
		  Object[][]data= new Object[rows][cols];
		  
		  for(int i =1; i<=rows; i++) {
			  for(int j =0;j<cols;j++) {
				  
				  data [i-1][j]=  util.getCellData("sheet1", i, j);
			  }
		  }
		//3987
		  //3999
		  //4013
		  //7018
		  //7032
		  //7045 -2mic
		  
		return data;
		  
	  }
}
