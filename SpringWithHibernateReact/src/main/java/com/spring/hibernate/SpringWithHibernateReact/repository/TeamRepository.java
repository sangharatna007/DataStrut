package com.spring.hibernate.SpringWithHibernateReact.repository;

import com.spring.hibernate.SpringWithHibernateReact.model.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends CrudRepository<Team, Long> {
    Team findByPlayers(long playerId);
}
