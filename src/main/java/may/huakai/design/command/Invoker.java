package may.huakai.design.command;

import org.junit.Test;

/**
 * @author: huakaimay
 * @since: 2020-12-25
 */
public class Invoker {

    private Command command = new ConcreteCommand();

    void cell() {
        command.execute();
    }

    private Receiver receiver = new Receiver();

    @Test
    public void run() {
        cell();
        receiver.action();
    }

}
