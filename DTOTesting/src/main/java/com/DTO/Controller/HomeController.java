package com.DTO.Controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DTO.ExceptionHandle.EmployeeNotFoundException;
import com.DTO.Model.Employee;
import com.DTO.Model.Employee2DTO;
import com.DTO.Model.EmployeeDTO;
import com.DTO.ServiceI.Iservice;

@CrossOrigin("*")
@RestController
public class HomeController {
	@Autowired
	Iservice si;

	@RequestMapping(value = "/save")
	private Employee savedata(@RequestBody Employee2DTO e) {
		ModelMapper mm = new ModelMapper();
		Employee emp = mm.map(e, Employee.class);
		si.saveData(emp);

		return emp;

	}

	@RequestMapping(value = "/getdata/{id}")
	public EmployeeDTO getData(@PathVariable("id") int id) {
		EmployeeDTO empd = si.getData(id);
		return empd;

	}

	@RequestMapping(value = "/getdata2")
	public List<EmployeeDTO> getdata() {
		List<EmployeeDTO> empd = si.getData2();
		return empd;

	}
	
	
	@RequestMapping(value="/getname/{empName}")
	public Employee getName(@PathVariable("empName") String empName) throws EmployeeNotFoundException
	{
		Employee e=si.getName(empName);
		System.out.println("======================================================");
		System.out.println(e.getEmpId());
		System.out.println(e.getEmpAddress());
		if(e!=null)
		{
		return e;

		}
		else
		{
			throw new EmployeeNotFoundException("Employee Not Found!!");
			
		}

	}

}
