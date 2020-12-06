package com.DTO.ServiceI;

import java.util.List;

import com.DTO.Model.Employee;
import com.DTO.Model.EmployeeDTO;

public interface Iservice 
{
	public void saveData(Employee emp);
	public EmployeeDTO getData(int id);
	public List<EmployeeDTO> getData2();
	public Employee getName(String empName);


}
