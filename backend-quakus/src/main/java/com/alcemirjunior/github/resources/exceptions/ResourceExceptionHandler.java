package com.alcemirjunior.github.resources.exceptions;

import com.alcemirjunior.github.services.exceptions.ResourceNotFoundException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.time.Instant;

@Provider
public class ResourceExceptionHandler implements ExceptionMapper<ResourceNotFoundException> {


    @Override
    public Response toResponse(ResourceNotFoundException e) {

        StandardError err = new StandardError();
        err.setTimestamp(Instant.now());
        err.setStatus(Response.Status.NOT_FOUND.getStatusCode());
        err.setError("Resource not found");
        err.setMessage(e.getMessage());
        err.setPath();

        return Response.status(Response.Status.NOT_FOUND).entity(err).build();
    }
}
