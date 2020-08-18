package examples;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class VarArgsExample {
  public static void main(String[] args) {
    anExampleSingleArg("hello");
    anExampleSingleArg("wow");
    anExampleMultipleArg("wow", "this", "is", "so", "cool");

  }

  private static Logger logger = LogManager.getLogger(VarArgsExample.class);

  private static void anExampleSingleArg(String arg) {
    logger.info(arg);
  }

  private static void anExampleMultipleArg(String... vars) {
    StringBuilder sb = new StringBuilder();
    for (String var : vars) {
      sb.append(var + " ");
    }
    logger.info(sb.toString());
  }

}
