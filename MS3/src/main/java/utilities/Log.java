package utilities;

import org.apache.logging.log4j.Logger;

public class Log {
	private static Logger Log = Logger(Log.class.getName());

	public void config() {
		PropertyConfigurator.configure(
				"C:\\Users\\M1087990\\seleniumprojects\\Ms3Reattempt\\src\\main\\resources\\Log4j2.properties");
	}

	private static Logger Logger(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void info(String message) {
		Log.info(message);
	}

	public static void warn(String message) {
		Log.warn(message);
	}

	public static void error(String message) {
		Log.error(message);
	}

	public static void fatal(String message) {
		Log.fatal(message);
	}

	public static void debug(String message) {
		Log.debug(message);
	}
}
