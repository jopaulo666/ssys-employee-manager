package br.com.jopaulo.ssys.dto;

import java.io.Serializable;
import java.time.Instant;

import br.com.jopaulo.ssys.entities.Employee;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Data
@Getter
@Setter
public class EmployeeDTO implements Serializable{

	private Long id;
	private String name;
	private String email;
	private String department;
	private Double salary;
	private Instant birthDate;
	
	public EmployeeDTO(Employee entity) {
		this.id = entity.getId();
		this.name = entity.getName();
		this.department = entity.getDepartment();
		this.salary = entity.getSalary();
		this.birthDate = entity.getBirthDate();
	}
	
	
}
