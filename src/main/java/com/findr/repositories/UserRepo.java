package com.findr.repositories;

import com.findr.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Yassine on 2017-03-22.
 */

public interface UserRepo extends MongoRepository<User, String> {

    public User findByEmail(String email);
}
