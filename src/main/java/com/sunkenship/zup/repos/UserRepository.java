package com.sunkenship.zup.repos;

import com.sunkenship.zup.data.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
