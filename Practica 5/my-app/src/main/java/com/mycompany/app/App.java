package com.mycompany.app;
import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        port(8081);
        get("/",(request,response)-> "Hola desde Spark");
        get("/adios",(request,response)-> "Adios desde Spark");
    }
}
