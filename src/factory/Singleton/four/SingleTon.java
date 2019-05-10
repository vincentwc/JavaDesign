package factory.Singleton.four;

/**
 * 使用静态内部类实现单例:
 *  当第一次调用getInstance()方法，会导致虚拟机加载HolderClass类，才会去初始化instance
 *  该方法不仅能保证线程安全，也能保证单例的唯一性，同时也延迟了单例的实例化
 */
public class SingleTon {

    private SingleTon() {
    }

    private static class HolderClass {
        private final static SingleTon instance = new SingleTon();
    }

    public static SingleTon getInstance() {
        return HolderClass.instance;
    }

    public static void main(String[] args) {
        SingleTon s1, s2;
        s1 = SingleTon.getInstance();
        s2 = SingleTon.getInstance();
        System.out.println(s1==s2);

    }
}
