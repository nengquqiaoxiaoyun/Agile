package may.huakai.design.singleton;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton instance = getInstance();
        Singleton instance1 = getInstance();
        System.out.println("no con: " + instance);

        System.out.println(instance == instance1);

    }
}
