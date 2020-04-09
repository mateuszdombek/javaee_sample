package com.dombek;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/HelloWorldViaJax")
public class HelloWorldViaJax {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response getMsg() {
        String result = "HelloWorld! via JAX";
        return Response.status(200).entity(result).build();
    }
}
