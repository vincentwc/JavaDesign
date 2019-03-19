package factory.concretefactory;

public class ConcreteFactory implements Factory {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
