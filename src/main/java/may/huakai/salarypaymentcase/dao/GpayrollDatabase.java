package may.huakai.salarypaymentcase.dao;

import may.huakai.salarypaymentcase.entity.Employee;

/**
 * 书中的类名
 * 实际上是对Employee的操作
 * 应该叫EmployeeDao更为合适
 *
 * @author: huakaimay
 * @since: 2020-12-29
 */
public interface GpayrollDatabase {
    /**
     * 添加雇员
     */
    void addEmployee(int id, Employee e);

    /**
     * 根据id删除雇员
     */
    void deleteEmployee(int empId);

    /**
     * 根据雇员id查询雇员信息
     * @return
     */
    Employee getEmployeeById(int empId);


    /**
     * 根据协会成员id获取协会的成员
     * @return
     */
    Employee getUnionMemberById(int memberId);

}
