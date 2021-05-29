package br.com.jopaulo.ssys.services;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.jopaulo.ssys.dto.EmployeeDTO;
import br.com.jopaulo.ssys.entities.Employee;
import br.com.jopaulo.ssys.repositories.EmployeeRepository;
import br.com.jopaulo.ssys.services.exception.ResourceNotFoundException;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;

	@Transactional(readOnly = true)
	public Page<EmployeeDTO> findAllPaged(PageRequest pageRequest){
		Page<Employee> list = repository.findAll(pageRequest);
		return list.map(x -> new EmployeeDTO(x));
	}
	
	@Transactional(readOnly = true)
	public Page<EmployeeDTO> findAllAge(PageRequest pageRequest){
		Page<Employee> list = repository.findAll(pageRequest);
		return list.map(x -> new EmployeeDTO(x));
	}
	
	@Transactional(readOnly = true)
	public Page<EmployeeDTO> findAllSalary(PageRequest pageRequest){
		Page<Employee> list = repository.findAll(pageRequest);
		return list.map(x -> new EmployeeDTO(x));
	}
	
	@Transactional(readOnly = true)
	public EmployeeDTO findById(long id) {
		Optional<Employee> obj = repository.findById(id);
		Employee entity = obj.orElseThrow(() -> new ResourceNotFoundException("Funcionário de código " +id+ " não encontrado"));
		return new EmployeeDTO(entity);
	}
	
	@Transactional
	public EmployeeDTO insert (EmployeeDTO dto) {
		Employee entity = new Employee();
		copyDtoToEntity(dto, entity);
		entity = repository.save(entity);
		return new EmployeeDTO(entity);
	}
	
	@Transactional
	public EmployeeDTO update (Long id, EmployeeDTO dto) {
		try {
			Employee entity = repository.getOne(id);
			copyDtoToEntity(dto, entity);
			entity = repository.save(entity);
			return new EmployeeDTO(entity);
		} catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException("Funcionário de código " +id+ " não encontrado");
		}
	}
	
	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException("Funcionário de código " +id+ " não encontrado");
		}
	}

	private void copyDtoToEntity(EmployeeDTO dto, Employee entity) {
		entity.setName(dto.getName());
		entity.setEmail(dto.getEmail());
		entity.setDepartment(dto.getDepartment());
		entity.setSalary(dto.getSalary());
		entity.setBirthDate(dto.getBirthDate());
	}
}
