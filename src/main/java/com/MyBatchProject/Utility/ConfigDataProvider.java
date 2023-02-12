package com.MyBatchProject.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {

	private Properties pro;
	public ConfigDataProvider() throws IOException {
	String path=System.getProperty("user.dir")+"\\Configuration\\config.Properties";
	File src=new File(path);
	FileInputStream fis=new FileInputStream(src);
	pro=new Properties();
	pro.load(fis);
}
	public String getBrowserName() {
		return pro.getProperty("BrowserName");
	}
	public String getBrowserNameFireFox() {
		return pro.getProperty(getBrowserNameFireFox());
	}
	public String getURL() {
		return pro.getProperty("BaseURL");
	}
}
