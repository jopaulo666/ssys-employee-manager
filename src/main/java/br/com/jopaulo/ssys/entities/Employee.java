package br.com.jopaulo.ssys.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@SuppressWarnings("serial")
@Data
@Getter
@Setter
//@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "tb_employee")
public class Employee implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String department;
	private Double salary;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE", name = "birth_date")
	private Instant birthDate;
	
}
