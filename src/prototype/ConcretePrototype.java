package prototype;

public class ConcretePrototype implements Prototype {

//    成员属性
    private String attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }


    public Prototype clone(){
//        创建新对象
        Prototype prototype = new ConcretePrototype();
        ((ConcretePrototype) prototype).setAttr(this.attr);
        return prototype;
    }
}
