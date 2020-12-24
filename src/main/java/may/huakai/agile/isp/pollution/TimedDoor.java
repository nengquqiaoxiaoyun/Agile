package may.huakai.agile.isp.pollution;

import org.junit.Test;

/**
 * @author: huakaimay
 * @since: 2020-12-24
 */
public class TimedDoor implements Door {


    @Override
    public void lock() {

    }

    @Override
    public void unLock() {

    }

    @Override
    public boolean isDoorOpen() {
        return false;
    }

    public void timeOut(Timer timer, TimerClient client) {
        timer.register(0, client);
    }


    @Test
    public void run() {
        timeOut(new Timer(), new DoorTimerAdapter());
    }


}
