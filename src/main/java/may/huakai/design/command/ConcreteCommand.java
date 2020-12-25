package may.huakai.design.command;

/**
 * @author: huakaimay
 * @since: 2020-12-25
 */
public class ConcreteCommand implements Command {

    private Receiver receiver = new Receiver();

    @Override
    public void execute() {
        receiver.action();
    }
}
