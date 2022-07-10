package com.microservice.department.controller;

import com.microservice.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import src.main.java.com.microservice.department.entity.Department;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{departmentId}")
    public Department findDepartmentById(@PathVariable("departmentId") Long departmentId){
        log.info("inside findDepartmentById method of DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }


}
