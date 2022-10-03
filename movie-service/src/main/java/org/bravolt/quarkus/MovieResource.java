package org.bravolt.quarkus;

import static javax.ws.rs.core.Response.ok;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.bravolt.quarkus.domain.Movie;
import org.bravolt.quarkus.repository.MovieRepository;

@Path("/movies")
@RequestScoped
public class MovieResource {

	private final MovieRepository repo;
	
	@Inject
	public MovieResource(MovieRepository repo) {
		this.repo = repo;
	}
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
    	return ok(this.repo.findAll()).build();
    }	
 
    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") final String id) {
    	Movie movie = repo.findById(Integer.parseInt(id));
    	System.out.println("In get() for ID");
    	
    	return ok(movie).build();
    }	    
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response create(Movie movie) {
    	repo.persist(movie);
    	
    	return ok(movie).build();
    }
}