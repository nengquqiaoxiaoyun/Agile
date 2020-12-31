package may.huakai.salarypaymentcase.paymentclafic;

import may.huakai.salarypaymentcase.SalesReceipt;

import java.math.BigDecimal;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public class SalariedClassification implements PaymentClassification {


    private BigDecimal salary;

    public SalariedClassification() {
    }

    public SalariedClassification(BigDecimal salary) {
        this.salary = salary;
    }


}
