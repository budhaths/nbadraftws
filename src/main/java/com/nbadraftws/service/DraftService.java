package com.nbadraftws.service;

import java.util.List;

import com.nbadraftws.entity.DraftPick;

public interface DraftService {

	
	public List<DraftPick> getAllPicks();
	
	public DraftPick findByRoundPick(int round, int pick);
	
	
}
