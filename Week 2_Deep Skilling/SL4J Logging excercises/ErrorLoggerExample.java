import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ErrorLoggerExample {

    private static final Logger logger = LoggerFactory.getLogger(ErrorLoggerExample.class);

    public static void main(String[] args) {
        logger.info("Application started.");

        try {
            int result = divide(10, 0);
            logger.info("Result: " + result);
        } catch (ArithmeticException e) {
            logger.error("Error occurred while dividing: ", e);
        }

        logger.warn("Application completed with warnings.");
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
