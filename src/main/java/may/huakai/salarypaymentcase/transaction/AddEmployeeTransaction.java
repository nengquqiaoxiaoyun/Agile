package may.huakai.salarypaymentcase.transaction;

import may.huakai.salarypaymentcase.paymentmd.HoldMethod;
import may.huakai.salarypaymentcase.dao.GpayrollDatabase;
import may.huakai.salarypaymentcase.dao.impl.GpayrollDatabaseImpl;
import may.huakai.salarypaymentcase.entity.Employee;
import may.huakai.salarypaymentcase.paymentclafic.PaymentClassification;
import may.huakai.salarypaymentcase.paymentmd.PaymentMethod;
import may.huakai.salarypaymentcase.paymentsc.PaymentSchedule;

/**
 * 添加雇员的操作
 *
 * @author: huakaimay
 * @since: 2020-12-29
 */
public abstract class AddEmployeeTransaction extends Transaction {

    private GpayrollDatabase gpayrollDatabase = new GpayrollDatabaseImpl();

    private int empId;
    private String empName;
    private String empAddress;

    /**
     * 不同雇员的支付类别不同，由子类自己实现
     */
    public abstract PaymentClassification getClassification();

    /**
     * 不同雇员的支付时间表不同，由子类自己实现
     */
    public abstract PaymentSchedule getSchedule();

    /**
     * 默认支付方式：HoldMethod
     * 如果想要更换，子类重写该方法
     */
    public PaymentMethod getMethod() {
        return new HoldMethod();
    }

    public AddEmployeeTransaction(int empid, String name, String address) {
        this.empId = empid;
        this.empName = name;
        this.empAddress = address;
    }


    /**
     * execute what? ...addEmployee
     */
    @Override
    public void execute() {
        addEmployee();
    }

    /**
     * 使用模板方式完成
     * 增加雇员的操作
     */
    private void addEmployee() {
        PaymentClassification pc = getClassification();
        PaymentSchedule ps = getSchedule();
        PaymentMethod pm = getMethod();
        Employee employee = new Employee(empId, empName, empAddress);
        employee.setPaymentClassification(pc);
        employee.setPaymentMethod(pm);
        employee.setPaymentSchedule(ps);
        gpayrollDatabase.addEmployee(empId, employee);
    }
}
