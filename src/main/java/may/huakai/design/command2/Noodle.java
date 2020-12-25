package may.huakai.design.command2;

/**
 * @author: huakaimay
 * @since: 2020-12-25
 */
public class Noodle implements Breakfast {

    private NoodleCook noodleCook = new NoodleCook();

    @Override
    public void cook() {
        noodleCook.action();
    }
}
