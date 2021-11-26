package com.exam.nguyenhoangson_exam_iasf.service;

import com.exam.nguyenhoangson_exam_iasf.entity.EmployeeEntity;
import com.exam.nguyenhoangson_exam_iasf.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public List<EmployeeEntity> getAllEmp() {
        return employeeRepo.findAll();
    }

    @Override
    public void saveEmp(EmployeeEntity employee) {
        employeeRepo.save(employee);
    }
}
