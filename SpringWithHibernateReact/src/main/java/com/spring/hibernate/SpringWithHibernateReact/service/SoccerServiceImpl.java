package com.spring.hibernate.SpringWithHibernateReact.service;

import com.spring.hibernate.SpringWithHibernateReact.model.Player;
import com.spring.hibernate.SpringWithHibernateReact.model.Team;
import com.spring.hibernate.SpringWithHibernateReact.repository.PlayerRepository;
import com.spring.hibernate.SpringWithHibernateReact.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class SoccerServiceImpl implements SoccerService{

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private TeamRepository teamRepository;



    public List<String> getAllTeamPlayer(long teamId) {
        List<String> result = new ArrayList<>();
        List<Player> players = playerRepository.findByTeamId(teamId);
        for(Player player : players)
        {
            result.add(player.getName());
        }
        return result;
    }


    public void addBarsilonaPlayer(String name, String postion, int number) {
        Team barshilona = teamRepository.findByPlayers(1L);

        Player newPlayer = new Player();
        newPlayer.setName(name);
        newPlayer.setPosition(postion);
        newPlayer.setNum(number);
        newPlayer.setTeam(barshilona);
        playerRepository.save(newPlayer);

    }
}
