
package com.myproject.RestAPIFitnessMember.repository;

import com.myproject.RestAPIFitnessMember.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Chatcharit
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    
}
