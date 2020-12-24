package cn.cnhoyun.agile.dip;

/**
 * @author: huakaimay
 * @since: 2020-12-24
 */
public class Button {
    private static ButtonServer buttonServer;

    public static void main(String[] args) {
        buttonServer = new Lamp();
        buttonServer.turnOn();
        buttonServer.turnOff();
    }
}
