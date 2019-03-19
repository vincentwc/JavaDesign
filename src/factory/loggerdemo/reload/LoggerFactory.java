package factory.loggerdemo.reload;


public interface LoggerFactory {

    Logger createLogger();

    Logger createLogger(String args);

    Logger createLogger(Object obj);
}
