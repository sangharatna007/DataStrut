package com.spring.hibernate.SpringWithHibernateReact;

import com.spring.hibernate.SpringWithHibernateReact.service.SoccerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringWithHibernateReactApplication implements CommandLineRunner {

	@Autowired
	SoccerService soccerService;

	public static void main(String[] args) {
		SpringApplication.run(SpringWithHibernateReactApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	 soccerService.addBarcelonaPlayer("Xavi Hernandez", "Midfielder", 6);
		List<String> players = soccerService.getAllTeamPlayers(1);
		for(String player : players)
		{
			System.out.println("Introducing Barca player => = [" + player + "]");
		}
	}
}
