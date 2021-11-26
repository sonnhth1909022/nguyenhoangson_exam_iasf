package com.exam.nguyenhoangson_exam_iasf.controller;

import com.exam.nguyenhoangson_exam_iasf.entity.EmployeeEntity;
import com.exam.nguyenhoangson_exam_iasf.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class JspController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/", "/index"})
    public String index(Model model){
        List<EmployeeEntity> empList = employeeService.getAllEmp();
        model.addAttribute("empList", empList);
        return "index";
    }

    @GetMapping("/insert")
    public String showNewEmpForm(Model model) {
        EmployeeEntity emp = new EmployeeEntity();
        model.addAttribute("emp", emp);
        return "add";
    }

    @PostMapping("/save")
    public String addNewEmp(@ModelAttribute("emp") EmployeeEntity emp) {
        employeeService.saveEmp(emp);
        return "redirect:/";
    }
}
