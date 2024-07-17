package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.bouncycastle.util.Properties;

public class ConfigReader 
{
	private java.util.Properties prop;
	
	/**
	 * This method is used to load the propeties from config.properties file
	 * @return
	 * @throws FileNotFoundException
	 */
	
	public java.util.Properties init_prop() throws FileNotFoundException
	{
		prop=new java.util.Properties();
		FileInputStream fis=new FileInputStream(".src\\test\\resource\\config\\config.properties");
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}

}
