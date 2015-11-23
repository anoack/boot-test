package com.andrenoack.boottest;

import com.andrenoack.boottest.dao.TeamDao;
import com.andrenoack.boottest.domain.Player;
import com.andrenoack.boottest.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class TestApplication {

    @Autowired
    TeamDao teamDao;

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @PostConstruct
    public void init() {
        Set<Player> players = new HashSet<>();
        players.add(new Player("Charly Brown", "pitcher"));
        players.add(new Player("Snoopy", "shortstop"));
        Team team = new Team("California", "Peanuts", players);
        teamDao.save(team);
    }


}
