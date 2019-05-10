package factory.MethodFactory.four;

import factory.MethodFactory.four.Logger;

public class DataBaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
