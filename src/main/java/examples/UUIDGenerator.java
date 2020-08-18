package examples;

import java.util.Base64;
import java.util.UUID;
import java.nio.ByteBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UUIDGenerator {
  public static void main(String[] args) {
    logger.info(getRandomUUID());
  }
  private static Logger logger = LogManager.getLogger(UUIDGenerator.class);

  private static String getRandomUUID() {
    UUID uuid = UUID.randomUUID();
    ByteBuffer buffer = ByteBuffer.allocate(16);
    buffer.putLong(uuid.getMostSignificantBits());
    buffer.putLong(uuid.getLeastSignificantBits());
    // Unset most significant bit of first byte
    // to ensure id starts with [A-Za-f].
    byte[] bytes = buffer.array();
    bytes[0] &= 0x7f;
    return Base64.getEncoder().withoutPadding().encodeToString(bytes);
  }
}
