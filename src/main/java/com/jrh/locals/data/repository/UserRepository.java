package com.jrh.locals.data.repository;

import com.jrh.locals.data.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
