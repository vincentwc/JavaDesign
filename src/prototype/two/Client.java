package prototype.two;

public class Client {

    public static void main(String[] args) {
        WeeklyLog log = new WeeklyLog();
        log.setName("张三丰");
        log.setDate("第一周");
        log.setContent("很忙，每天加班");

        System.out.println("****工作周报****");
        System.out.println("周次：" + log.getDate());
        System.out.println("姓名：" + log.getName());
        System.out.println("内容：" + log.getContent());
        System.out.println("--------------------------------");

        WeeklyLog log_new;
        log_new = log.clone();
        log_new.setDate("第三周");
        System.out.println("****周报****");
        System.out.println("周次：" + log_new.getDate());
        System.out.println("姓名：" + log_new.getName());
        System.out.println("内容：" + log_new.getContent());

        System.out.println("--------------------------------");
        System.out.println("****工作周报****");
        System.out.println("周次：" + log.getDate());
        System.out.println("姓名：" + log.getName());
        System.out.println("内容：" + log.getContent());

    }
}
