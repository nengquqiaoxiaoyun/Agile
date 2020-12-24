package may.huakai.agile.dip;

/**
 * @author: huakaimay
 * @since: 2020-12-24
 */
public class Lamp implements ButtonServer{
    public void turnOn() {
        System.out.println(this.getClass().getSimpleName() + " is turn on");
    }

    public void turnOff() {
        System.out.println(this.getClass().getSimpleName() + " is turn off");
    }
}
