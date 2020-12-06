package com.DTO.IserviceImpl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DTO.Model.Employee;
import com.DTO.Model.EmployeeDTO;
import com.DTO.Repository.EmployeeRepository;
import com.DTO.ServiceI.Iservice;

@Service
public class ServiceImpl implements Iservice {

	@Autowired
	EmployeeRepository er;

	@Override
	public void saveData(Employee emp) {
		er.save(emp);
	}

	@Override
	public EmployeeDTO getData(int id) {
		Employee emp = er.findById(id).get();
		ModelMapper mm = new ModelMapper();
		EmployeeDTO empd = mm.map(emp, EmployeeDTO.class);

		return empd;
	}

	@Override
	public List<EmployeeDTO> getData2() 
	{
		List<EmployeeDTO> empd=er.fetchdata();
		return empd;
	}

	@Override
	public Employee getName(String empName) 
	{
		Employee ee=er.findByEmpName(empName);
		return ee;
	}

}
