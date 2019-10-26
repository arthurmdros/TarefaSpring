package net.codejava.customer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CustomerService {
	@Autowired 
	CustomerRepository repo;
	
	public List<Customer> listAll(){
		return (List<Customer>) repo.findAll();		
	}
	
	public void save(Customer customer) {
		repo.save(customer);
	}
	
	public Customer get(long id) {
		Optional<Customer> result = repo.findById(id);
		return result.get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
	
	public List<Customer> search(String keyword){
		return repo.search(keyword);
	}
}
