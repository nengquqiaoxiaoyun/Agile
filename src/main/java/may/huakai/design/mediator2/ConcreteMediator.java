package may.huakai.design.mediator2;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public class ConcreteMediator implements Mediator {

    private ComponentA componentA;
    private ComponentB componentB;
    private ComponentC componentC;

    @Override
    public void register(Component component) {
        component.setMediator(this);
        String simpleName = component.getClass().getSimpleName();
        switch (simpleName) {
            case "ComponentA":
                componentA = (ComponentA) component;
                break;
            case "ComponentB":
                componentB = (ComponentB) component;
                break;
            case "ComponentC":
                componentC = (ComponentC) component;
                break;
        }
    }

    public void click() {
        System.out.println("表单提交");
        componentB.notifyOther();
    }

    public void handle() {
        System.out.println("接收到表单信息---开始处理");
        componentC.notifyOther();
    }

    public void result() {
        System.out.println("处理结果：");
        System.out.println("404 NOT FOUND");
    }
}
