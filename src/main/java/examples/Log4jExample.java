package examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample {
  private static Logger logger = LogManager.getLogger(Log4jExample.class);

  public static void main(String[] args) {
    logger.debug("log4j example: a sample debug statement");
    logger.info("log4j Sample info");
    logger.warn("log4j smaple warn");
//    logger.error("log4j sample error");
//    logger.fatal("log4j fatal");
  }
}
