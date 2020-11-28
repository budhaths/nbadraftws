package com.nbadraftws.dao;

import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.nbadraftws.entity.Player;

@Repository
public class PlayerDAOImpl implements PlayerDAO {


	//define field for entity manager
	private EntityManager entityManager;
	
	//set up constructor injection
	@Autowired
	public PlayerDAOImpl(EntityManager theEntityManager) {
		entityManager= theEntityManager;
	}
	
	@Override
	public List<Player> getAllPlayers() {
	
		//get the current hibernate session
			Session currentSession = entityManager.unwrap(Session.class);
				
				//create a query
			Query<Player> theQuery = 
						currentSession.createQuery("from Player", Player.class);
				
				//execute query and get result list
			List<Player> players = theQuery.getResultList(); 
				
				//return the results
			return players;
	}

	@Override
	public Player findByPlayerID(int pid) {
		
		//get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//create  a query
		Player thePlayer = 
				currentSession.get(Player.class, pid);
		
		return thePlayer;
	}

}
