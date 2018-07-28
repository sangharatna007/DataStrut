package com.spring.hibernate.SpringWithHibernateReact.repository;

import com.spring.hibernate.SpringWithHibernateReact.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long>
{
    List<Player> findByTeamId(long teamId);

}
