package may.huakai.salarypaymentcase.entity;

import may.huakai.salarypaymentcase.Affiliation;
import may.huakai.salarypaymentcase.paymentclafic.PaymentClassification;
import may.huakai.salarypaymentcase.paymentmd.PaymentMethod;
import may.huakai.salarypaymentcase.paymentsc.PaymentSchedule;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public class Employee {
    private int empId;
    private String empName;
    private String empAddress;
    private PaymentMethod paymentMethod;
    private PaymentClassification paymentClassification;
    private PaymentSchedule paymentSchedule;
    private Affiliation affiliation;

    public Employee() {
    }

    public Employee(int empId, String empName, String empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentClassification getPaymentClassification() {
        return paymentClassification;
    }

    public void setPaymentClassification(PaymentClassification paymentClassification) {
        this.paymentClassification = paymentClassification;
    }

    public PaymentSchedule getPaymentSchedule() {
        return paymentSchedule;
    }

    public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
        this.paymentSchedule = paymentSchedule;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }
}
