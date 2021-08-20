package com.sulabh.employeemanagementapp.repo;

import com.sulabh.employeemanagementapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    public Optional<Employee> findEmployeeById(Long id);

    public void deleteEmployeeById(Long id);
}
