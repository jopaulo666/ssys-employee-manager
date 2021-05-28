package br.com.jopaulo.ssys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.jopaulo.ssys.dto.EmployeeDTO;
import br.com.jopaulo.ssys.entities.Employee;
import br.com.jopaulo.ssys.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	@Transactional(readOnly = true)
	public Page<EmployeeDTO> findAllPaged(PageRequest pageRequest){
		Page<Employee> list = repository.findAll(pageRequest);
		return list.map(x -> new EmployeeDTO(x));
	}
	
}
