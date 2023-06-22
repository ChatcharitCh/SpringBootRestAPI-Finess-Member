
package com.myproject.RestAPIFitnessMember.service;

import com.myproject.RestAPIFitnessMember.model.Customer;
import com.myproject.RestAPIFitnessMember.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Chatcharit
 */
@Service
@Transactional
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
     public List<Customer> listAllCustomer() {
        return customerRepository.findAll();
    }

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public Customer getCustomer(Integer id) {
        return customerRepository.findById(id).get();
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }
}
