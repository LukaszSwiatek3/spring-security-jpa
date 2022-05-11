package com.example.springsecurityjpa.service;


import com.example.springsecurityjpa.models.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AddressService {
    @Autowired
    JdbcTemplate jdbcTemplate;

    /*
     * List for data from database
     */
    public List<Address> getAll() {
        String sql = "SELECT * FROM ADRESSES";
        List<Address> listAddresses = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Address.class));
        return listAddresses;
    }

    /* (C)reate - Insert new record */
    public void save(Address address) {
        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        simpleJdbcInsert.withTableName("Addresses").usingColumns();
    }

    /* (R)ead - read data from database */
    public Address getById(long idAddress) {
        Object[] args = {idAddress};
        String sql = "SELECT * FROM ADDRESSES WHERE Id_address = " + args[0];
        Address adresy = jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Address.class));
        return adresy;
    }

    /* (U)pdate - data inside database */
    public void update(Address address) {
        String sql = "UPDATE ADDRESSES SET nameAddress=:nameAddress, country=:country, city=:city, postalCode=:postalCode, street=:street, streetNumber=:streetNumber, apartmentNumber=:apartmentNumber " + " WHERE idAddress=:idAddress";
        BeanPropertySqlParameterSource param = new BeanPropertySqlParameterSource(address);
        NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(jdbcTemplate);
        template.update(sql, param);
    }

    /* (D)elete - chosen data */
    public void delete(long idAddress) {
        jdbcTemplate.update("DELETE FROM ADDRESSES WHERE Id_address = ?", idAddress);
    }
}