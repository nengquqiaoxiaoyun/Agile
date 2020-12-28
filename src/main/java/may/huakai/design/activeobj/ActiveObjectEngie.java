package may.huakai.design.activeobj;

import org.junit.Test;

import java.util.LinkedList;

/**
 * @author: huakaimay
 * @since: 2020-12-28
 */
public class ActiveObjectEngie {

    private LinkedList<Command> itsCommands = new LinkedList<>();

    public void addCommand(Command c) {
        itsCommands.addLast(c);
    }

    public void run() {
        System.out.println("size: " + itsCommands.size());
        while (!itsCommands.isEmpty()) {
            Command first = itsCommands.getFirst();
            itsCommands.removeFirst();
            first.execute();
        }
    }

    @Test
    public void app() {
        addCommand(new TestCommand());
        addCommand(new TestCommand2());
        run();
    }
}
