package may.huakai.agile.ocp.template;

/**
 * @author: huakaimay
 * @since: 2020-12-23
 */
public abstract class Policy {

    void policyFunction() {
        System.out.println("policy do");
        serviceFunction();
    }

    abstract void serviceFunction();
}
