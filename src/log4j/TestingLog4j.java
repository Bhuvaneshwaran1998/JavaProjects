package log4j;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestingLog4j {
	
		static Logger log = Logger.getLogger(TestingLog4j.class);

		public static void main(String[] args) {
			
			PropertyConfigurator.configure("log4j.properties");
			log.info("this log4j information");
			log.error("error occurce");
			log.warn("warning massage");
			log.debug("Debugging");
			log.fatal("critical error");

		}

	}
