package com.nbadraftws.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nbadraftws.dao.PlayerDAO;
import com.nbadraftws.entity.Player;

@Service
public class PlayerServiceImpl implements PlayerService{

	private PlayerDAO playerDAO;
	
	public PlayerServiceImpl(PlayerDAO thePlayerDAO) {
		playerDAO=thePlayerDAO;
	}
	
	@Override
	@Transactional
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return playerDAO.getAllPlayers();
	}

	@Override
	@Transactional
	public Player findByPlayerID(int pid) {
		// TODO Auto-generated method stub
		return playerDAO.findByPlayerID(pid);
	}
}
