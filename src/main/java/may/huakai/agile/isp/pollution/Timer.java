package may.huakai.agile.isp.pollution;

/**
 * @author: huakaimay
 * @since: 2020-12-24
 */
public class Timer {

    void register(int timeOut, TimerClient timerClient) {
        timerClient.timeOut(timeOut);
    }

}
