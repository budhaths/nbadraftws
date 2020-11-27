package com.nbadraftws.dao;
import java.util.*;

import com.nbadraftws.entity.DraftPick;


public interface DraftPickDAO {

	public List<DraftPick> getAll();
	
	public DraftPick findByRoundPick(int round, int pick);
	
	
	
}
