package com.antonov.service;

import com.sun.net.httpserver.HttpServer;
import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * Created by dmitriyantonov on 31.05.16.
 */
@Path("/helloworld")
public class NAAService {

    @GET
    @Produces("text/plain")
    public String getClichedMessage() {
        return "Hello World";
    }
}
