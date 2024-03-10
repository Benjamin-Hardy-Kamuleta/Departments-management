package com.benjaminHardy.microservicedepartment.controller;

import com.benjaminHardy.microservicedepartment.client.EmployeeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private EmployeeClient employeeClient;
}
