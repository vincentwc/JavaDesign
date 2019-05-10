该项目是用来学Java设计模式的项目，不同的设计模式通过不同包分开：

    https://blog.csdn.net/LoveLion/article/details/17517213?tdsourcetag=s_pctim_aiomsg

概念：
    计模式用于在特定的条件下为一些重复出现的软件设计问题提供合理的、有效的解决方案
    设计模式(Design Pattern)是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结，使用设计模式是为了可重用代码、让代码更容易被他人理解并且保证代码可靠性
    
面向对象设计原则：
- 单一职责原则：一个类只负责一个功能领域中的相应职责，或者可以定义为：就一个类而言，应该只有一个引起它变化的原因
- 开闭原则：对扩展开放，对修改关闭
- 里氏代换原则(Liskov Substitution Principle, LSP)：所有引用基类（父类）的地方必须能透明地使用其子类的对象
- 依赖倒转原则(Dependency Inversion  Principle, DIP)：抽象不应该依赖于细节，细节应当依赖于抽象。换言之，要针对接口编程，而不是针对实现编程
- 接口隔离原则(Interface  Segregation Principle, ISP)：使用多个专门的接口，而不使用单一的总接口，即客户端不应该依赖那些它不需要的接口
- 合成复用原则(Composite Reuse Principle, CRP)：尽量使用对象组合，而不是继承来达到复用的目的
- 迪米特法则(Law of  Demeter, LoD)：一个软件实体应当尽可能少地与其他实体发生相互作用

包的概述：
factory.SimpleFactory 简单工厂
