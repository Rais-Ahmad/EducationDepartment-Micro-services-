package com.example.EducationDepartment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.EducationDepartment.Model.Degree;

/**
 * 
 * @author Rais Ahmad
 * @date 29/10/2021
 * @Discription Degree Repository
 *
 */

public interface DegreeRepository extends JpaRepository<Degree, Long>{

	
}
