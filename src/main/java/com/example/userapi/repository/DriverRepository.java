package com.example.userapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.userapi.entity.Driver;

public interface DriverRepository extends CrudRepository<Driver, Long> {
    List<Driver> findByEmail(String email);

    List<Driver> findByName(String name);

    @Query("SELECT COUNT(*) FROM drivers WHERE email = ?1 OR cpf = ?2")
    Integer findExistsUser(String email, String cpf);
}
