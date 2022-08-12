package com.example.demo.repositories;

import com.example.demo.models.Enterprice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnterpriceRepository extends CrudRepository<Enterprice, Long> {
}
