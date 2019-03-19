package singleton;

/**
 * 懒汉模式：单例实例在第一次被使用时构建，延迟初始化
 * 【可能会出现线程安全问题，要加双重锁】
 * 优点：
 */
public class SingleTon2 {

    private SingleTon2() {
    }

    private static SingleTon2 instance = null;

    //效率低，应换成双重校验锁
//    private static synchronized SingleTon2 getInstance(){
//        if (instance == null){
//            instance = new SingleTon2();
//        }
//        return instance;
//    }
    public static SingleTon2 getInstance() {
        if (instance == null) {
            synchronized (SingleTon2.class) {
                if (instance == null) {
                    instance = new SingleTon2();
                }
            }
        }
        return instance;
    }
}
