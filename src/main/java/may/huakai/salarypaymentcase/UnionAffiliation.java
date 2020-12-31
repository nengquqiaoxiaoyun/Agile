package may.huakai.salarypaymentcase;

/**
 * @author: huakaimay
 * @since: 2020-12-30
 */
public class UnionAffiliation implements Affiliation {

    private ServiceCharge serviceCharge;


    public void addServiceCharge(ServiceCharge serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public UnionAffiliation() {
    }


}
