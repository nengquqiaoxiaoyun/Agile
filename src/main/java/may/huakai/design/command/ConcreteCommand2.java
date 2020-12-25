package may.huakai.design.command;

/**
 * @author: huakaimay
 * @since: 2020-12-25
 */
public class ConcreteCommand2 implements Command {

    private Receiver2 receiver = new Receiver2();

    @Override
    public void execute() {
        receiver.action();
    }
}
