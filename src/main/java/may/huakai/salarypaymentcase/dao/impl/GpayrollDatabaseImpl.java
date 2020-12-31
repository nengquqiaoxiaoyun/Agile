package may.huakai.salarypaymentcase.dao.impl;

import may.huakai.salarypaymentcase.dao.GpayrollDatabase;
import may.huakai.salarypaymentcase.entity.Employee;
import may.huakai.salarypaymentcase.paymentclafic.CommissionedClassification;
import may.huakai.salarypaymentcase.paymentsc.WeeklySchedule;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public class GpayrollDatabaseImpl implements GpayrollDatabase {

    /**
     * 用map模拟数据库
     */
    private static Map<Integer, Employee> employeeMap = new HashMap<>();

    @Override
    public void addEmployee(int id, Employee e) {
        employeeMap.put(id, e);
    }

    @Override
    public void deleteEmployee(int empId) {
        employeeMap.remove(empId);
    }

    @Override
    public Employee getEmployeeById(int empId) {
        return employeeMap.get(empId);
    }

    @Override
    public Employee getUnionMemberById(int memberId) {
        return null;
    }
}
