package may.huakai.salarypaymentcase.transaction;

import may.huakai.salarypaymentcase.TimeCard;
import may.huakai.salarypaymentcase.dao.GpayrollDatabase;
import may.huakai.salarypaymentcase.dao.impl.GpayrollDatabaseImpl;
import may.huakai.salarypaymentcase.entity.Employee;
import may.huakai.salarypaymentcase.paymentclafic.HourlyClassfication;
import may.huakai.salarypaymentcase.paymentclafic.PaymentClassification;

import java.time.LocalDateTime;

/**
 * @author: huakaimay
 * @since: 2020-12-30
 */
public class TimeCardTransaction extends Transaction {
    private GpayrollDatabase gpayrollDatabase = new GpayrollDatabaseImpl();

    private int empId;
    /**
     * 日期
     */
    private LocalDateTime date;
    /**
     * 工作时间
     */
    private Double hours;

    public TimeCardTransaction(int empId, LocalDateTime date, Double hours) {
        this.empId = empId;
        this.date = date;
        this.hours = hours;
    }

    @Override
    public void execute() {
        Employee employee = gpayrollDatabase.getEmployeeById(empId);
        addTimeCard(employee);
    }

    private void addTimeCard(Employee employee) {
        if (employee != null) {
            PaymentClassification paymentClassification = employee.getPaymentClassification();
            if (paymentClassification instanceof HourlyClassfication) {
                HourlyClassfication hourlyClassfication = (HourlyClassfication) paymentClassification;
                hourlyClassfication.addTimeCard(new TimeCard(date, hours));
                System.out.println("TimeCard add success");
            } else {
                System.err.println("Employee is not a HourlyEmployee");
            }
        } else {
            System.err.println("No Such Employee");
        }
    }

    public static void main(String[] args) {
        TimeCardTransaction timeCardTransaction = new TimeCardTransaction(1, LocalDateTime.now(), 10d);
        timeCardTransaction.execute();
    }
}
