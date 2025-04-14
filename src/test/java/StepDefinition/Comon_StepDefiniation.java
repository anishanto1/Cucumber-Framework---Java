package StepDefinition;

import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;

import Utilities.commonutilities;
import io.cucumber.core.options.Constants;
import io.cucumber.java.Before;


public class Comon_StepDefiniation {

	public static WebDriver driver;
	private static final org.apache.log4j.Logger LOGGER = (org.apache.log4j.Logger) LogManager.getLogger(Comon_StepDefiniation.class);

	@Before    
	public void beforscenario() {

		LOGGER.info("Execution Started");
		try {
			// Load properties from a utility class
			LOGGER.info("Instantiating the common Utils");
			commonutilities common = new commonutilities();
			LOGGER.info("Loading the property files");
			common.loadproperties();
			// Initialize the WebDriver if it's null
			LOGGER.info("Checking the driver is null or not?");
			if (driver == null) {
				// Example: Initialize the driver here (e.g., using WebDriverManager)
				driver = commonutilities.initializeDriver();
				System.out.println("WebDriver initialized successfully.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println("An error occurred during the setup.");
		}
	}
}