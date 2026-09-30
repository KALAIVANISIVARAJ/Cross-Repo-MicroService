package com.specathon.customer.repository;
import com.specathon.customer.model.Customer; import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer,Long> {}