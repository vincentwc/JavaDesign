package factory.MethodFactory.three;

public class DataBaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        //连接数据库
        //创建数据库日志记录对象
        Logger logger = new DataBaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}
