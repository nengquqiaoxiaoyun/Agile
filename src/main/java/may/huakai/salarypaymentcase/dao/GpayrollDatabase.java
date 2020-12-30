package may.huakai.salarypaymentcase.dao;

import may.huakai.salarypaymentcase.entity.Employee;

/**
 * 书中的类名
 * 实际上是对Employee的操作
 * 应该叫EmployeeDao更为合适
 * @author: huakaimay
 * @since: 2020-12-29
 */
public interface GpayrollDatabase {
    void addEmployee(int id, Employee e);
}
