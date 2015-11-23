package com.andrenoack.boottest.dao;

import com.andrenoack.boottest.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by andre.noack on 23.11.15.
 */
@RestResource(path = "teams", rel = "teams")
public interface TeamDao extends CrudRepository<Team, Long> {

	@Override
	Iterable<Team> findAll();
	Team findByName(String name);

}
