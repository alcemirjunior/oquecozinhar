package com.alcemirjunior.github.services;

import com.alcemirjunior.github.dto.UserDTO;
import com.alcemirjunior.github.entities.User;
import com.alcemirjunior.github.repositories.UserRepository;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Dependent
public class UserService {

    @Inject
    UserRepository userRepository;

    public List<UserDTO> findAll (){
        List<User> userList = userRepository.listAll();
        List<UserDTO> dtoList = new ArrayList<>();
        userList.forEach((x) -> dtoList.add(new UserDTO(x)));
        return dtoList;
    }

    @Transactional
    public void insert (UserDTO dto){
        User user = new User();
        dtoToEntity(dto, user);
        userRepository.persist(user);
    }

    @Transactional
    public UserDTO update (Long id, UserDTO dto){
        Optional<User> userOptional = userRepository.findByIdOptional(id);
        if(userOptional.isPresent()){
            User user = userOptional.get();
            dtoToEntity(dto,user);
            userRepository.persist(user);
            return new UserDTO(user);
        }else{
            throw new NotFoundException("User Not Found: " + id);
        }
    }

    @Transactional
    public void delete (Long id){
        Optional<User> userOptional = userRepository.findByIdOptional(id);
        if(userOptional.isPresent()){
            userRepository.deleteById(id);
        }else{
            throw new NotFoundException("User Not Found: " + id);
        }
    }

    public void dtoToEntity(UserDTO dto, User entity){
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
    }
}
