package com.alcemirjunior.github.resources;


import com.alcemirjunior.github.entities.User;
import com.alcemirjunior.github.services.UserService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    UserService userService;

    @GET
    @Path("{id}")
    public User findById(@PathParam("id") Long id){
        return userService.findById(id);
    }
}
