package factory.MethodFactory.four;

public interface LoggerFactory {

    public Logger createLogger();

    public Logger createLogger(String args);

    public Logger createLogger(Object obj);
}
