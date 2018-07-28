package com.spring.hibernate.SpringWithHibernateReact.service;

import java.util.List;

public interface SoccerService {

    public List<String> getAllTeamPlayer(long teamId);
    public void addBarsilonaPlayer(String name, String postion, int number);
}
