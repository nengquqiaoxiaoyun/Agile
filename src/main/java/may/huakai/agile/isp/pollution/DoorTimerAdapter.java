package may.huakai.agile.isp.pollution;


/**
 * @author: huakaimay
 * @since: 2020-12-24
 */
public class DoorTimerAdapter implements TimerClient {


    public void timeOut(int timeOutId) {
        System.out.println("timeout!!!");
    }

}
