package com.benarfa.mysqlcrud;


import org.springframework.data.repository.CrudRepository;
import com.benarfa.mysqlcrud.Employee;
public interface EmpRepo extends CrudRepository<Employee, Integer> {

}
