package may.huakai.salarypaymentcase.transaction;

import may.huakai.salarypaymentcase.SalesReceipt;
import may.huakai.salarypaymentcase.dao.GpayrollDatabase;
import may.huakai.salarypaymentcase.dao.impl.GpayrollDatabaseImpl;
import may.huakai.salarypaymentcase.entity.Employee;
import may.huakai.salarypaymentcase.paymentclafic.CommissionedClassification;
import may.huakai.salarypaymentcase.paymentclafic.PaymentClassification;

import java.time.LocalDateTime;

/**
 * 登记销售凭条的操作
 * @author: huakaimay
 * @since: 2020-12-30
 */
public class SalesReceiptTransaction extends Transaction {

    private GpayrollDatabase gpayrollDatabase = new GpayrollDatabaseImpl();

    private int empid;
    private LocalDateTime date;
    private int amount;

    @Override
    public void execute() {
        Employee employee = gpayrollDatabase.getEmployeeById(empid);

        if (employee != null) {
            PaymentClassification paymentClassification = employee.getPaymentClassification();
            if (paymentClassification instanceof CommissionedClassification) {
                CommissionedClassification salariedClassification = (CommissionedClassification)paymentClassification;
                salariedClassification.addSalesReceipt(new SalesReceipt(date, amount));
                System.out.println("CommissionedClassification add success");
            } else {
                System.err.println("Employee is not a CommissionedClassification");
            }
        } else {
            System.err.println("No Such Employee");
        }

    }

    public SalesReceiptTransaction(int empid, LocalDateTime date, int amount) {
        this.empid = empid;
        this.date = date;
        this.amount = amount;
    }

    public static void main(String[] args) {
        new SalesReceiptTransaction(1,LocalDateTime.now(),10).execute();
    }


}
