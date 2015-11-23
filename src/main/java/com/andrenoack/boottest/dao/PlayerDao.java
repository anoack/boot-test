package com.andrenoack.boottest.dao;

import com.andrenoack.boottest.domain.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by andre.noack on 23.11.15.
 */
@RestResource(path = "players", rel = "players")
public interface PlayerDao  extends CrudRepository<Player, Long> {
}
