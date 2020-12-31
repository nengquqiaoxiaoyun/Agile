package may.huakai.salarypaymentcase.transaction;

import may.huakai.salarypaymentcase.dao.GpayrollDatabase;
import may.huakai.salarypaymentcase.dao.impl.GpayrollDatabaseImpl;

/**
 * 删除雇员的操作
 * @author: huakaimay
 * @since: 2020-12-30
 */
public class DeleteEmployeeTransaction extends Transaction {
    private GpayrollDatabase gpayrollDatabase = new GpayrollDatabaseImpl();
    private int empId;

    public DeleteEmployeeTransaction(int empId) {
        this.empId = empId;
    }

    @Override
    public void execute() {
        gpayrollDatabase.deleteEmployee(empId);
    }
}
