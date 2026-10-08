package com.ui.dataproviders;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.google.gson.Gson;
import com.ui.pojos.TestData;
import com.ui.pojos.User;

public class LoginDataProvider {

	@DataProvider(name = "LoginTestDataProvider")
	public Iterator<Object[]> loginDataProvider()
	{
		Gson gson = new Gson();
		File JSONFile = new File(System.getProperty("user.dir")+"\\testData\\LoginData.json");
		FileReader fileReader =null;
		
		try {
			fileReader = new FileReader(JSONFile);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		TestData testdata = gson.fromJson(fileReader, TestData.class);
		
		List<Object[]> dataToReturn = new ArrayList<Object[]>();
		
		for( User u :testdata.getData())
		{
			dataToReturn.add(new Object[] {u});
		}
		
		return dataToReturn.iterator();
	}
	
}
