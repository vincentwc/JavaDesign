package factory.loggerdemo;

public class Client {

    public static void main(String[] args) {
        LoggerFactory loggerFactory;
        Logger logger;
        loggerFactory = new FileLoggerFactory();
        logger = loggerFactory.createLogger();
        logger.writeLog();
    }
}