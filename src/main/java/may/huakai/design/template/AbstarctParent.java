package may.huakai.design.template;

/**
 * 算法的步骤是确定的
 * 在模板方法中按顺序执行，将可变操作（抽象方法）交由子类实现
 *
 * @author: huakaimay
 * @since: 2020-12-28
 */
public abstract class AbstarctParent {

    public final void template() {
        operate();
        spec();
        operate2();
    }

    private void spec() {

    }

    abstract void operate();

    abstract void operate2();

}
