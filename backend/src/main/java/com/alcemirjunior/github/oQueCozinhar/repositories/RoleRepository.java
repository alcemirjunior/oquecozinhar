package com.alcemirjunior.github.oQueCozinhar.repositories;


import com.alcemirjunior.github.oQueCozinhar.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
