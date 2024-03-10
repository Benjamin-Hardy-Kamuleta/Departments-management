package com.benjaminHardy.microservicedepartment.repository;

public record Employee(long id, long departmentId, String name, int age, String position) {
}
