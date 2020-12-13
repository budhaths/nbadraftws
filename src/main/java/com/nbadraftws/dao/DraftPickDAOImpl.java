package com.nbadraftws.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nbadraftws.constant.RestConstants;
import com.nbadraftws.entity.DraftPick;
import com.nbadraftws.entity.Player;
import com.nbadraftws.vo.DraftPickVO;

@Repository
public class DraftPickDAOImpl implements DraftPickDAO {


	//define field for entity manager
	private EntityManager entityManager;
	
	//set up constructor injection
	@Autowired
	public DraftPickDAOImpl(EntityManager theEntityManager) {
		entityManager= theEntityManager;
	}
	
	@Override
	public List<DraftPick> getAllPicks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DraftPick findByRoundPick(int round, int pick) {
	
		return getRoundPickDetails(round, pick).get(0);
	}

	@Override
	public List<DraftPick> getUndraftedPlayers() {
		
		List<DraftPickVO> finalUndraftedList;
		
		List<DraftPick> tempList = getRoundPickDetails(RestConstants.undraftedRound,RestConstants.undraftedPick);
		return tempList;
		
	}
	
	private List<DraftPick> getRoundPickDetails (int round, int pick){
		// get the current hibernate session
				Session currentSession = entityManager.unwrap(Session.class);
		//get object with round and pick
				Query theQuery = 
							currentSession.createQuery(
										"from DraftPick where round=:rnd and pick=:pck");
				theQuery.setParameter("rnd", round);
				theQuery.setParameter("pck", pick);
				List<DraftPick> tempList = theQuery.list();
				
				return tempList;
	}
	
	

}
