package com.alcemirjunior.github.repositories;

import com.alcemirjunior.github.entities.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {

    public User findById (Long id){
        return find("id", id).firstResult();
    }
}
