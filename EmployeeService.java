package io.lavanya.employeelist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	List<Employee> e =new ArrayList<Employee>(Arrays.asList(
			new Employee("lavanya",9227,20000.00),
			new Employee("lov",9228,20000.00),
			new Employee("lvns",9229,20000.00)
           ));
	List<Employee> getAllEmployees(){
		return e;
	}
	Employee getEmployeeName(String id){
		return e.stream().filter(t->t.getName().equals(id)).findFirst().get();

	}
	void addEmployee(Employee e1){
		e.add(e1);
	}
	void updateEmployee(String id,Employee e1){
		for(int i=0;i<e.size();i++){
			Employee e2=e.get(i);
			if(e2.getName().equals(id)){
				e.set(i, e1);
			}
		}
	}
	void deleteEmployee(String id){
		for(int i=0;i<e.size();i++){
			Employee e2=e.get(i);
			if(e2.getName().equals(id)){
				e.remove(i);
			}
		}
		
	}
}
