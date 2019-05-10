package factory.AbstractFactory;

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("浅绿色边框文本框...");
    }
}
