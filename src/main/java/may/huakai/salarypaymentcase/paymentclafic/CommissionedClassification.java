package may.huakai.salarypaymentcase.paymentclafic;

import may.huakai.salarypaymentcase.SalesReceipt;

import java.math.BigDecimal;

/**
 * @author: huakaimay
 * @since: 2020-12-30
 */
public class CommissionedClassification implements PaymentClassification {

    /**
     * 销售凭条
     */
    private SalesReceipt salesReceipt;
    /**
     * 基本薪资
     */
    private BigDecimal salary;
    /**
     * 提成
     */
    private BigDecimal commissionRate;

    public CommissionedClassification() {
    }

    public CommissionedClassification(BigDecimal salary, BigDecimal commissionRate) {
        this.salary = salary;
        this.commissionRate = commissionRate;
    }

    public void addSalesReceipt(SalesReceipt salesReceipt) {
        this.salesReceipt = salesReceipt;
    }
}
