package com.sunkenship.zup.repos;

import com.sunkenship.zup.data.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}