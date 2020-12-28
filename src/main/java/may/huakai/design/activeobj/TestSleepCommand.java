package may.huakai.design.activeobj;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * @author: huakaimay
 * @since: 2020-12-28
 */
public class TestSleepCommand extends TestCase {
    public static void main(String[] args) {
        TestRunner.main(new String[]{"TestSleepCommand"});
    }

    public TestSleepCommand(String name) {
        super(name);
    }

    private boolean commandExecuted = false;

    public void testSleep() {
        Command wakeup = () -> commandExecuted = true;
        ActiveObjectEngie e = new ActiveObjectEngie();
        SleepCommand c = new SleepCommand(1000, e, wakeup);
        e.addCommand(c);
        long start = System.currentTimeMillis();
        e.run();
        long stop = System.currentTimeMillis();
        long sleepTime = stop - start;
        System.out.println(sleepTime);
        System.out.println(commandExecuted);
//        assertEquals("SleepTime" + sleepTime + " expected > 1000", sleepTime > 1000);
//        assertEquals("SleepTime" + sleepTime + " expected < 1100", sleepTime < 1100);
//        assertEquals("Command Executed", commandExecuted);
    }
}
