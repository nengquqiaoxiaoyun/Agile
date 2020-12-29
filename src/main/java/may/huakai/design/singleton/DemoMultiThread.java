package may.huakai.design.singleton;

public class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(() -> System.out.println(InnerSingleton.getInstance()));
        Thread threadBar = new Thread(() -> System.out.println(InnerSingleton.getInstance()));
        threadFoo.start();
        threadBar.start();
    }

}