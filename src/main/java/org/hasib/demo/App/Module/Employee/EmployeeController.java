package org.hasib.demo.App.Module.Employee;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
  // object level define
  EmployeeInterface employeeService = new EmployeeService() ;
  // Dependency Injection
  // @Autowired
  // EmployeeInterface employeeService;

  @GetMapping("employees")
  public List<EmployeeModel> getAllEmployees() {
    return employeeService.readEmployee();
  }

  @PostMapping("create-employee")
  public String createEmployee(@RequestBody EmployeeModel employee) {
    // employees.add(employee);
  return  employeeService.createEmployee(employee);
   
  }

  @DeleteMapping("employee/{id}")
  public String deleteEmployee(@PathVariable Long id){
    if(employeeService.deleteEmployee(id))
    return "Delete SuccessFully ";
    return "Not Found";
  }


}
