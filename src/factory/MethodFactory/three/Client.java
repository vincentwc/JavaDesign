package factory.MethodFactory.three;

public class Client {

    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory();// 可通过配置文件实现
        logger = factory.createLogger();
        logger.writeLog();
    }
}
