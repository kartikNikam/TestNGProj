package com.test.utility;

import java.util.ArrayList;

public class Testutil {
	static Xls_Reader  reader;
	
	
	public static ArrayList<Object[]>getdatafromexcel()
	{
		
		ArrayList<Object[]>mydata = new ArrayList<Object[]>();
		try {
			reader = new Xls_Reader("C:\\Users\\kartikpc\\eclipse-workspace\\TestNGProj\\src\\testdata\\registration.xlsx");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		for(int rowNum =2;rowNum<=reader.getRowCount("registration");rowNum++) {
			
			String firstname = reader.getCellData("registration","firstname",rowNum);
			String lastname = reader.getCellData("registration","lastname",rowNum);
			String username = reader.getCellData("registration","username",rowNum);
			String password = reader.getCellData("registration","password",rowNum);
			String confirmed = reader.getCellData("registration","confirmed",rowNum);
			
			
			Object ob[] = {"firstname","lastname","username","password","confirmed" };	
			mydata.add(ob);
					}
		
		return mydata;
	}
	
	
	

}
