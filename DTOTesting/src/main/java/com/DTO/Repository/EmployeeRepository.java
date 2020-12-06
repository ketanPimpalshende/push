package com.DTO.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.DTO.Model.Employee;
import com.DTO.Model.EmployeeDTO;

@Repository
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer>
{
	@Query("select new com.DTO.Model.EmployeeDTO(e.empName, d.deptName) from Employee e INNER JOIN e.dept d")
	public List<EmployeeDTO> fetchdata();
	
	public Employee findByEmpName(String empName);
	

}
