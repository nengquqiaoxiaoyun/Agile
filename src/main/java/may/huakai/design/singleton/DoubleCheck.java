package may.huakai.design.singleton;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public class DoubleCheck {

    private static volatile DoubleCheck doubleCheck;

    private DoubleCheck() {

    }

    public static DoubleCheck getInstance() {
        if (doubleCheck == null) {
            synchronized (DoubleCheck.class) {
                if (doubleCheck == null) {
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
