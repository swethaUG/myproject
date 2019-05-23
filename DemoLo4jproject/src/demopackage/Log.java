package demopackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {
	public static Logger logger = Logger.getLogger("Log");
	public static void get(String message)
	{
		PropertyConfigurator.configure("log4j.properties");
		logger.info(message);
	}
	
	

}
