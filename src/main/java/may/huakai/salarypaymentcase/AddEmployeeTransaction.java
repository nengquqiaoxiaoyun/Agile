package may.huakai.salarypaymentcase;

import may.huakai.salarypaymentcase.dao.GpayrollDatabase;
import may.huakai.salarypaymentcase.dao.impl.GpayrollDatabaseImpl;
import may.huakai.salarypaymentcase.entity.Employee;
import may.huakai.salarypaymentcase.paymentclafic.PaymentClassification;
import may.huakai.salarypaymentcase.paymentmd.PaymentMethod;
import may.huakai.salarypaymentcase.paymentsc.PaymentSchedule;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public abstract class AddEmployeeTransaction extends Transaction {

    private GpayrollDatabase gpayrollDatabase = new GpayrollDatabaseImpl();

    private int empId;
    private String empName;
    private String empAddress;

    abstract PaymentClassification getClassification();

    abstract PaymentSchedule getSchedule();

    void addEmployeeTransaction(int empid, String name, String address) {
        this.empId = empid;
        this.empName = name;
        this.empAddress = address;
    }


    /**
     * execute what? ...addEmployee
     */
    @Override
    void execute() {
        addEmployee();
    }

    /**
     * 使用模板方式完成
     * 增加雇员的操作
     */
    void addEmployee() {
        PaymentClassification pc = getClassification();
        PaymentSchedule ps = getSchedule();
        PaymentMethod pm = new HoldMethod();
        Employee employee = new Employee(empId, empName, empAddress);
        employee.setPaymentClassification(pc);
        employee.setPaymentMethod(pm);
        employee.setPaymentSchedule(ps);
        gpayrollDatabase.addEmployee(empId, employee);
    }
}
