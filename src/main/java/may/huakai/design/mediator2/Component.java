package may.huakai.design.mediator2;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public interface Component {

    void setMediator(Mediator mediator);

    void notifyOther();
}
