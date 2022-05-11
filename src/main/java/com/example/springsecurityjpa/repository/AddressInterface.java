package com.example.springsecurityjpa.repository;

import com.example.springsecurityjpa.models.Address;
import com.example.springsecurityjpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AddressInterface extends JpaRepository<Address, Long>{
    @Query("SELECT a FROM Address a WHERE a.nameAddress =?1")
    Optional<Address> findByNameAddress(String nameAddress);

}
