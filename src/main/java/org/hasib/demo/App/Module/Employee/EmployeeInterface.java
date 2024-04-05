package org.hasib.demo.App.Module.Employee;

import java.util.List;

// BluePrint
public interface EmployeeInterface {
 String createEmployee( EmployeeModel  employee);
 List <EmployeeModel> readEmployee();
 boolean deleteEmployee(Long id);

}
