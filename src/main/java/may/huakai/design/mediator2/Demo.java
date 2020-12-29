package may.huakai.design.mediator2;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public class Demo {

    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        concreteMediator.register(new ComponentA());
        concreteMediator.register(new ComponentB());
        concreteMediator.register(new ComponentC());
        concreteMediator.click();
    }
}
