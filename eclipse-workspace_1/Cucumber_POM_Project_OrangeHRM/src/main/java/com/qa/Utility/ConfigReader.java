package com.qa.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader 
{
	private Properties prop;
	
	public Properties init_prop() throws IOException
	{
		prop=new Properties();
		try 
		{
			FileInputStream file=new FileInputStream("./src/test/resources/config/config.properties");
			prop.load(file);
			
		} 
		catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
	}

}
