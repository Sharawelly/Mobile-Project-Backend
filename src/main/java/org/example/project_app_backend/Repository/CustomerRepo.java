package org.example.project_app_backend.Repository;

import java.util.Optional;

import org.example.project_app_backend.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(String email);
}
