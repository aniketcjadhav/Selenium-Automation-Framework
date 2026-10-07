package com.ui.pojos;

import java.util.Map;

public class Config {

	Map<String, Environment> environments ; //environments give same name as in JSON file

	public Map<String, Environment> getEnvironment() {
		return environments;
	}

	public void setEnvironment(Map<String, Environment> environment) {
		this.environments = environment;
	}
	
	
}
