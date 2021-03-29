package com.alcemirjunior.github.oQueCozinhar.repositories;


import com.alcemirjunior.github.oQueCozinhar.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
