package com.exam.nguyenhoangson_exam_iasf.repository;

import com.exam.nguyenhoangson_exam_iasf.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {
}
