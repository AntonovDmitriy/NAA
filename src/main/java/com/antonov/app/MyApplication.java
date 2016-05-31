package com.antonov.app;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("rest")
public class MyApplication extends ResourceConfig {
    public MyApplication() {
        packages("org.foo.rest;org.bar.rest");
    }
}