package com.alcemirjunior.github.oQueCozinhar.dto;

import com.alcemirjunior.github.oQueCozinhar.services.validation.UserInsertValid;

@UserInsertValid
public class UserInsertDTO extends UserDTO{
    private static final long serialVersionUID = 1L;

    private String password;

    UserInsertDTO(){
        super();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
