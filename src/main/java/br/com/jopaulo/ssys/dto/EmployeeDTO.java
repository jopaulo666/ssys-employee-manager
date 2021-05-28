package br.com.jopaulo.ssys.dto;

import java.io.Serializable;
import java.time.Instant;

import br.com.jopaulo.ssys.entities.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@SuppressWarnings("serial")
@Getter
@Setter
@Data
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
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
		this.email = entity.getEmail();
		this.department = entity.getDepartment();
		this.salary = entity.getSalary();
		this.birthDate = entity.getBirthDate();
	}
	
	
}
