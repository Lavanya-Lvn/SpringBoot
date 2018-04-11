package io.lavanya.employeelist;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService es;
	@RequestMapping("/employees")
public List<Employee> getEmployees(){
	return es.getAllEmployees();
}
	@RequestMapping("/employees/{id}")
	public Employee getName(@PathVariable String id){
		return es.getEmployeeName(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/employees")
	public void addEmploy(@RequestBody Employee e){
		es.addEmployee(e);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/employees/{id}")
	public void updateEmploy(@RequestBody Employee e,@PathVariable String id){
		es.updateEmployee(id,e);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/employees/{id}")
	public void deleteEmploy(@PathVariable String id){
		es.deleteEmployee(id);
	}
}
