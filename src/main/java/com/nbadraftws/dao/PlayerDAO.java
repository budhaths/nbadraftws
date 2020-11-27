package com.nbadraftws.dao;
import java.util.*;

import com.nbadraftws.entity.Player;

public interface PlayerDAO {

	public List<Player> getAll();
	
	public Player findByPlayerID();
	
}
