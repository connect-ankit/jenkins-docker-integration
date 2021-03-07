package com.inn.ccm.student.repository;

import org.springframework.data.repository.CrudRepository;

import com.inn.ccm.student.model.Address;

public interface AddressRepo extends CrudRepository<Address, Integer> {

}
