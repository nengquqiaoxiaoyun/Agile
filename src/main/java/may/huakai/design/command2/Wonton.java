package may.huakai.design.command2;

/**
 * @author: huakaimay
 * @since: 2020-12-25
 */
public class Wonton implements Breakfast {

    private WontonCook wontonCook = new WontonCook();

    @Override
    public void cook() {
        wontonCook.action();
    }
}
