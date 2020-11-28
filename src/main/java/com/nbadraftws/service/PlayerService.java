package com.nbadraftws.service;

import java.util.List;

import com.nbadraftws.entity.Player;

public interface PlayerService {

	public List<Player> getAllPlayers();
	public Player findByPlayerID(int pid);
	
}
