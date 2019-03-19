package singleton;

/**
 * 饿汉模式：
 * 优点   线程安全
 *        类加载的同时已经创建好一个静态对象，调用时反应速度快
 * 缺点   资源效率不高，可能getInstance()永远不会执行到，但执行该类的其他静态方法或者加载了该类（class.forName)，那么这个实例仍然初始化
 */
public class SingleTon1 {

    private SingleTon1() {
    }

    //实例化放在静态代码块里课提高程序的执行效率，但也可能更占用空间
    private final static SingleTon1 instance = new SingleTon1();

    public static SingleTon1 getInstance(){
        return instance;
    }
}
