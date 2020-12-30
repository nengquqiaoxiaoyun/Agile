package may.huakai.salarypaymentcase;

import may.huakai.salarypaymentcase.paymentclafic.PaymentClassification;
import may.huakai.salarypaymentcase.paymentclafic.SalariedClassification;
import may.huakai.salarypaymentcase.paymentsc.MothlySchedule;
import may.huakai.salarypaymentcase.paymentsc.PaymentSchedule;

import java.math.BigDecimal;

/**
 * 添加正式员工
 * 正式员工的支付类别：按月薪支付
 * 支付时间表：每月支付
 *
 * @author: huakaimay
 * @since: 2020-12-29
 */
public class AddSalariedEmployee extends AddEmployeeTransaction {

    /**
     * 薪水
     */
    private BigDecimal salary;

    void addEmployeeTransaction(int empid, String name, String address, BigDecimal salary) {
        super.addEmployeeTransaction(empid, name, address);
        this.salary = salary;
    }

    @Override
    PaymentClassification getClassification() {
        return new SalariedClassification(salary);
    }

    @Override
    PaymentSchedule getSchedule() {
        return new MothlySchedule();
    }
}
