package com.alcemirjunior.github.resources;


import com.alcemirjunior.github.dto.UserDTO;
import com.alcemirjunior.github.services.UserService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @Inject
    UserService userService;

    @GET
    public  List<UserDTO> findAll(){
        return userService.findAll();
    }

    @POST
    public Response insert (@Valid UserDTO dto){
        userService.insert(dto);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("{id}")
    public UserDTO update (@PathParam("id") Long id, @Valid UserDTO dto){
        return userService.update(id, dto);
    }

    @DELETE
    @Path("{id}")
    public Response delete (@PathParam("id") Long id){
        userService.delete(id);
        return Response.noContent().build();
    }
}
