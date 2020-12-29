package may.huakai.design.singleton;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public class InnerSingleton {

    private static class Singleton {
        private static final InnerSingleton INSTANCE = new InnerSingleton();
    }

    private InnerSingleton() {

    }

    public static InnerSingleton getInstance() {
        return Singleton.INSTANCE;
    }
}
