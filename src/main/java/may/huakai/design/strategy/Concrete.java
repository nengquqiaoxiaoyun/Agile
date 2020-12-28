package may.huakai.design.strategy;

/**
 * @author: huakaimay
 * @since: 2020-12-28
 */
public class Concrete {

    private Strategy strategy;

    public Concrete(Strategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.operate1();
        strategy.operate2();
    }
}
