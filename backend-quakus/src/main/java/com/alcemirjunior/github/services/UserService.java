package com.alcemirjunior.github.services;

import com.alcemirjunior.github.entities.User;
import com.alcemirjunior.github.repositories.UserRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;

@Dependent
public class UserService {

    @Inject
    UserRepository userRepository;

    public User findById (Long id){
        return userRepository.findById(id);
    }
}
