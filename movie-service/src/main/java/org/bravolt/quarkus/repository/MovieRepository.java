package org.bravolt.quarkus.repository;

import javax.enterprise.context.ApplicationScoped;

import org.bravolt.quarkus.domain.Movie;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class MovieRepository implements PanacheRepositoryBase<Movie, Integer> {
	
}
