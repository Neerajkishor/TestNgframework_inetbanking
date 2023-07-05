package com.inetbanking.utilities;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;

public class Readconfig {
	
	Properties pro;
	public Readconfig()
	{
		File src= new File("./Configuration/config.properties");
			try {
				FileInputStream fis = new FileInputStream(src);
				pro= new Properties();
					pro.load(fis);
					
				} catch (Exception e) {
					System.out.println("Exception");
				}		
		}	
public String getApplicationurl()
{
	String url = pro.getProperty("baseurl");
	return url;
	}
	

public String getusername()
{
String username = pro.getProperty("username");
return username;
}

public String getpassword()
{
String password = pro.getProperty("password");
return password;
}

public String getchromepath()
{
String chromepath = pro.getProperty("chromepath");
return chromepath;
}
public String getfirefoxpath()
{
String firefoxpath = pro.getProperty("firefoxpath");
return firefoxpath;
}
	
}
