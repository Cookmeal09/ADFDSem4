package com.exam.demo.data;

import org.springframework.data.repository.CrudRepository;

import com.exam.demo.Supplier;

public interface SupplierRepository extends CrudRepository<Supplier, Long> {
}
