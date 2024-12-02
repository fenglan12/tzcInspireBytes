package io.github.fenglan12.tzcinspirebytes.handler;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")  // /api
public class IndexHandler {

    @GET
    public String index() {
        return "Hello World!";
    }
}
