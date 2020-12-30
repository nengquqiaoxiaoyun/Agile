package may.huakai.salarypaymentcase.dao.impl;

import may.huakai.salarypaymentcase.dao.GpayrollDatabase;
import may.huakai.salarypaymentcase.entity.Employee;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: huakaimay
 * @since: 2020-12-29
 */
public class GpayrollDatabaseImpl implements GpayrollDatabase {

    private static Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();

    @Override
    public void addEmployee(int id, Employee e) {
        employeeMap.put(id, e);
    }
}
