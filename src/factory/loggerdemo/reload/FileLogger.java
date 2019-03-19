package factory.loggerdemo.reload;


public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录...");
    }
}
