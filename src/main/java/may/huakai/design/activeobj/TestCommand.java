package may.huakai.design.activeobj;

/**
 * @author: huakaimay
 * @since: 2020-12-28
 */
public class TestCommand implements Command {
    @Override
    public void execute() {
        System.out.println("test aaa");
    }
}
