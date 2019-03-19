package factory.SimpleFactory;

public class LoggerFactory {

    public static Logger createLogger(String args) {
        if (args.equalsIgnoreCase("db")) {
            Logger logger = new DataBaseLogger();
            return logger;
        }else if (args.equalsIgnoreCase("file")){
            Logger logger = new FileLogger();
            return logger;
        }else {
            return null;
        }
    }
}
