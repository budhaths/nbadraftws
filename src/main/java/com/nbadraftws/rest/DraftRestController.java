package com.nbadraftws.rest;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.nbadraftws.entity.Player;
import com.nbadraftws.service.DraftService;
import com.nbadraftws.service.PlayerService;

//url: http://localhost:8085/apiv1.0/players

@RestController
@RequestMapping("/apiv1.0")
public class DraftRestController {
	
	private DraftService draftService;
	private PlayerService playerService;
	
	@Autowired
	public DraftRestController(DraftService thedraftService, PlayerService theplayerService) {
		draftService = thedraftService;
		playerService=theplayerService;
	}
	
	//expose "/players" and return list of players from the draft
	@GetMapping("/players")
	public List<Player> getAll(@RequestParam (value="playerid", required=false) int posid){
		
		List<Player> myList = new ArrayList<>();
		
		if (posid<=0)
			return playerService.getAllPlayers();
		else
			myList.add(playerService.findByPlayerID(posid));
			return myList;
	}
	
	

}
