package may.huakai.design.mediator2;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public class ComponentB implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void notifyOther() {
        mediator.handle();
    }
}
