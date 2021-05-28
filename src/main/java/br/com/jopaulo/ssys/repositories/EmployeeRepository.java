package br.com.jopaulo.ssys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jopaulo.ssys.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
