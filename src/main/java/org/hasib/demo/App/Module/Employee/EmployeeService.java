package org.hasib.demo.App.Module.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements EmployeeInterface {

  List<EmployeeModel> employees = new ArrayList<>();

  @Override
  public String createEmployee(EmployeeModel employee) {
    employees.add(employee);
    return "Saved SuccessFully !!";
  }

  @Override
  public List<EmployeeModel> readEmployee() {
return employees;
  }

  @SuppressWarnings("unlikely-arg-type")
  @Override
  public boolean deleteEmployee(Long id) {
   employees.remove(id);
   return true;
  }

}
