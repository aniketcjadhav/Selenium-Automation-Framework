package com.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.constants.Env;
import com.google.gson.Gson;
import com.ui.pojos.Config;
import com.ui.pojos.Environment;

public class JSONUtility {

	public static String readJSON(Env env) 
	{
		Gson gson = new Gson();
		File file = new File(System.getProperty("user.dir")+"\\Config\\config.json");
		FileReader filereader =null;
		try {
			filereader = new FileReader(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		Config config = gson.fromJson(filereader, Config.class);
		Environment environment = config.getEnvironment().get(""+env+"");
		
		return environment.getUrl();
	}
}
