package com.inn.ccm.student.servcie;

import org.springframework.beans.factory.annotation.Autowired;

import com.inn.ccm.student.model.Address;
import com.inn.ccm.student.repository.AddressRepo;

public class AddressServcieImpl implements IAddressService  {

	@Autowired(required = false)
	AddressRepo repo;
	@Override
	public Address saveAddress(Address createdObj) {
		return repo.save(createdObj);
	}
	

	
}
