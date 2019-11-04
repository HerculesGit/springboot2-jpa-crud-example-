package net.guides.springboot2.springboot2jpacrudexample.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.guides.springboot2.springboot2jpacrudexample.models.Employee;

@Repository
public interface EmplooyerRepository extends JpaRepository<Employee, Long>{

}
