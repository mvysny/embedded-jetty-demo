package com.example;

import spark.Spark;
import spark.servlet.SparkApplication;
import spark.servlet.SparkFilter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * @author mavi@vaadin.com
 */
public class SparkRest implements SparkApplication {
    @Override
    public void init() {
        Spark.get("/rest/hello", (req, res) -> "Hello World");
    }

    @Override
    public void destroy() {

    }

    @WebFilter(urlPatterns = "/rest/*", initParams = {@WebInitParam(name = "applicationClass", value = "com.example.SparkRest")})
    public static class SparkFilter2 extends SparkFilter {
    }
}
