package com.exam.nguyenhoangson_exam_iasf.service;

import com.exam.nguyenhoangson_exam_iasf.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> getAllEmp();
    void saveEmp(EmployeeEntity employee);
}
