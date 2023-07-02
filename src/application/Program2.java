package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: findById ===");
		Department dep = departmentDao.findById(1);
		System.out.println(dep);
		
		System.out.println("=== TEST 2: findAll ===");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list)
		{
			System.out.println(obj);
		}
		
		System.out.println("=== TEST 3: insert ===");
		Department newDepartment = new Department(null, "Food");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("=== TEST 4: update ===");
		dep = departmentDao.findById(2);
		dep.setName("HQs");
		departmentDao.update(dep);
		System.out.println("Update completed!");
		
		System.out.println("=== TEST 5: delete ===");
		departmentDao.deleteById(6);
		System.out.println("Delete completed!");

	}

}
