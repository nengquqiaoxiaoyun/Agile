package cn.cnhoyun.agile.ocp.template;

/**
 * @author: huakaimay
 * @since: 2020-12-23
 */
public class Application {

    private static Policy policy = new PolicyImp2();

    public static void main(String[] args) {
        policy.policyFunction();
    }
}
