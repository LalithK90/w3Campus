package w3Campus.asset.employee.service;

import w3Campus.asset.employee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();

    Employee findById(Long id);

    Employee persist(Employee employee);

    boolean delete(Long id);

    List<Employee> search(Employee employee);

    boolean isEmployeePresent(Employee employee);

    Employee lastEmployee();

    Employee findByNic(String nic);
}
