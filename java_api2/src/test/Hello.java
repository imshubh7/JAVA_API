package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@Path("/hello")
public class Hello {
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayHello() 
	{
		String resource="<? xml version='1.0' ?>"+"<hello>Hello Shubham I am your first rest api from ";
		return resource;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHelloJSON() 
	{
		String resource=null;
		return resource;
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTLM() 
	{
		String resource="<h1>Hello shubham this is from html</h1>";
		return resource;
	}

}
