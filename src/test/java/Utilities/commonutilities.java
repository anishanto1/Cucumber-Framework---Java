package Utilities;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import constants.constants;

public class commonutilities {

	public  void loadproperties() throws FileNotFoundException{
		/*
		 * FileReader reader = null ; try { reader = new
		 * FileReader("config.properties");
		 * 
		 * } catch (FileNotFoundException e) { e.printStackTrace(); }
		 */

		Properties properties = new Properties();
		/*
		 * try {
		 * 
		 * properties.load(reader); } catch (IOException e) { e.printStackTrace(); }
		 */
		try {
			properties.getClass().getResourceAsStream("/config.properties");
		} catch (Exception e) {
			e.printStackTrace();
		}

		constants.APP_URL =	properties.getProperty("APP_URL");
		constants.BROWSER =	properties.getProperty("BROWSER");
		constants.UserName = properties.getProperty("UserName");
		constants.Password = properties.getProperty("Password");
	}

	public static WebDriver initializeDriver() {
		// TODO Auto-generated method stub
		return null;
	}

	public static String initializeDriver1() {
		// TODO Auto-generated method stub
		return null;
	}
}
