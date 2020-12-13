package com.nbadraftws.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbadraftws.dao.DraftPickDAO;
import com.nbadraftws.dao.PlayerDAO;
import com.nbadraftws.entity.DraftPick;
import com.nbadraftws.entity.Player;

@Service
public class DraftServiceImpl implements DraftService{

	private DraftPickDAO draftPickDAO;

	@Autowired
	public DraftServiceImpl(DraftPickDAO thedraftPickDAO) {
		draftPickDAO=thedraftPickDAO;
	}
	
	@Override
	@Transactional
	public List<DraftPick> getAllPicks() {
		// TODO Auto-generated method stub
		return draftPickDAO.getAllPicks();
	}

	@Override
	@Transactional
	public DraftPick findByRoundPick(int round, int pick) {
		// TODO Auto-generated method stub
		return draftPickDAO.findByRoundPick(round, pick);
	}

	@Override
	public List<DraftPick> getUndraftedPlayers() {
		// TODO Auto-generated method stub
		return draftPickDAO.getUndraftedPlayers();
	}

	

}
