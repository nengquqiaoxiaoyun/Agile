package may.huakai.salarypaymentcase.transaction;

import may.huakai.salarypaymentcase.paymentclafic.HourlyClassfication;
import may.huakai.salarypaymentcase.paymentclafic.PaymentClassification;
import may.huakai.salarypaymentcase.paymentsc.PaymentSchedule;
import may.huakai.salarypaymentcase.paymentsc.WeeklySchedule;

import java.math.BigDecimal;

/**
 * 钟点工
 * 支付类别：按小时支付
 * 支付时间表：每周支付
 *
 * @author: huakaimay
 * @since: 2020-12-30
 */
public class AddHourlyEmployee extends AddEmployeeTransaction {
    /**
     * 时薪
     */
    private BigDecimal hourlyRate;


    public AddHourlyEmployee(int empid, String name, String address, BigDecimal hourlyRate) {
        super(empid, name, address);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public PaymentClassification getClassification() {
        return new HourlyClassfication(hourlyRate);
    }

    @Override
    public PaymentSchedule getSchedule() {
        return new WeeklySchedule();
    }
}
