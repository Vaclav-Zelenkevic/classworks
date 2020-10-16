package lt.vtmc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaLoggingThree {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(JavaLoggingThree.class);
		logger.info("Message");
	}

}
