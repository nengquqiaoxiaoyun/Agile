package may.huakai.salarypaymentcase.transaction;

import may.huakai.salarypaymentcase.paymentclafic.CommissionedClassification;
import may.huakai.salarypaymentcase.paymentclafic.PaymentClassification;
import may.huakai.salarypaymentcase.paymentsc.BiweeklySchedule;
import may.huakai.salarypaymentcase.paymentsc.PaymentSchedule;

import java.math.BigDecimal;

/**
 * 销售员工
 * 支付类别：月薪 + 提成
 * 支付方式：每两月支付
 *
 * @author: huakaimay
 * @since: 2020-12-30
 */
public class AddCommissionedEmployee extends AddEmployeeTransaction {

    /**
     * 基本薪水
     */
    private BigDecimal salary;

    /**
     * 提成
     */
    private BigDecimal commissionRate;


    public AddCommissionedEmployee(int empid, String name, String address, BigDecimal salary, BigDecimal commissionRate) {
        super(empid, name, address);
        this.salary = salary;
        this.commissionRate = commissionRate;
    }


    @Override
    public PaymentClassification getClassification() {
        return new CommissionedClassification(salary, commissionRate);
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new BiweeklySchedule();
    }
}
