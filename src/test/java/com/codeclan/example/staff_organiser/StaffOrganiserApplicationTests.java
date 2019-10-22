package com.codeclan.example.staff_organiser;

import com.codeclan.example.staff_organiser.models.Department;
import com.codeclan.example.staff_organiser.models.Employee;
import com.codeclan.example.staff_organiser.models.Project;
import com.codeclan.example.staff_organiser.repositories.DepartmentRepository;
import com.codeclan.example.staff_organiser.repositories.EmployeeRepository;
import com.codeclan.example.staff_organiser.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class StaffOrganiserApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateProjectAndEmployeeAndDepartment() {
		Project x = new Project("Military Product X", 100);
		projectRepository.save(x);


		Department sales = new Department("Sales");
		departmentRepository.save(sales);

		Employee sue = new Employee("Sue", "Davidson", 1);
		sue.setDepartment(sales);
		employeeRepository.save(sue);

		x.addEmployeeToProject(sue);
		projectRepository.save(x);

		Employee bert = new Employee("Bert", "Johnson", 2);
		bert.setDepartment(sales);
		employeeRepository.save(bert);
	}

}
