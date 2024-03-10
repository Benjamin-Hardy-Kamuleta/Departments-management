package com.benjaminHardy.microservicedepartment.model;

import com.benjaminHardy.microservicedepartment.repository.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Department {

    private long id;
    private String name;
    private List<Employee> employees = new ArrayList<>();
}
