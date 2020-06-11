package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {

	public List<Department> findAll(){
	
		//MOCKAR = só retornar os dados de mentira
		
		List<Department> list = new ArrayList<>();
		list.add(new Department(1,"Books"));
		list.add(new Department(2,"Computers"));
		list.add(new Department(1,"Electronics"));
		return list;
		
	}
	
	
}
