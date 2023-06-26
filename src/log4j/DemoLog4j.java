package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class DemoLog4j {
	static Logger log = Logger.getLogger(DemoLog4j.class);

	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		log.info("this log4j information");
		log.error("error occurce");
		log.warn("warning massage");
		log.debug("Debugging");
		log.fatal("critical error");

	}

}
