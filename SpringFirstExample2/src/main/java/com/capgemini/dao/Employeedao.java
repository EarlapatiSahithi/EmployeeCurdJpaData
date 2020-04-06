package com.capgemini.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.bean.Employee;
@Repository
public interface Employeedao extends JpaRepository <Employee,Integer>{
List<Employee> findByEname(String empName);
}