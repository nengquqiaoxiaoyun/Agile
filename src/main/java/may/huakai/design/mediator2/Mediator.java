package may.huakai.design.mediator2;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public interface Mediator {
    void register(Component component) throws IllegalAccessException, InstantiationException;

    void click();

    void handle();

    void result();
}
