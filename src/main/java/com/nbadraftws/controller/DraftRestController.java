package com.nbadraftws.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.nbadraftws.entity.DraftPick;
import com.nbadraftws.entity.Player;
import com.nbadraftws.exception.ResourceNotFoundException;
import com.nbadraftws.service.DraftService;
import com.nbadraftws.service.PlayerService;
import com.nbadraftws.vo.DraftPickVO;

//url: http://localhost:8085/apiv1.0/players

@RestController
@RequestMapping("/apiv1.0")
public class DraftRestController {
	

	private DraftService draftService;
	
	private PlayerService playerService;
	
	@Autowired
	public DraftRestController(DraftService draftService, PlayerService playerService) {
		this.draftService = draftService;
		this.playerService = playerService;
	}

	//expose "/players" and return list of players from the draft
	@GetMapping("/players")
	public List<Player> getAll(){
		
			return playerService.getAllPlayers();
	}
	
	//expose "/players/playerid" and return the specific player
	
	@GetMapping("/players/{playerid}")
	public ResponseEntity<Player>getPlayerById (
							@PathVariable(value="playerid") int playerid ) throws ResourceNotFoundException{
		if(playerid > 99) {
			throw new ResourceNotFoundException("Player not found on :: " + playerid);
		}
		
		Player tempPlayer = 
				playerService
						.findByPlayerID(playerid);
		
		return ResponseEntity.ok().body(tempPlayer);			
	}
	
	
	/*
	 * expose "draftpick" by providing round and pick details
	 * returns the draft pick details with player information
	 */
	
	@GetMapping ("/draftpick")
	public ResponseEntity<DraftPickVO> getByRoundAndPick(@RequestParam (value="round", defaultValue="1") int round,
										 @RequestParam (value="pick", defaultValue="1") int pick) throws ResourceNotFoundException {
		Player player=null;
		DraftPick draftPick=null;
		
		if( (round==1 && pick <=30) || (round==2 && (pick > 30 || pick <=60))){
			
				draftPick=draftService.findByRoundPick(round, pick);
				player=playerService.findByPlayerID(draftPick.getPlayerID());
				
		}else {
				throw new ResourceNotFoundException("Invalid request :: Round 1 -> Pick 1 to 30 :: Round 2 -> Pick 30 to 60");
		}
		
		// finally put all the info in DraftPickVO and return
		DraftPickVO tempVO = new DraftPickVO(draftPick,player);
		return ResponseEntity.ok().body(tempVO);
		
	}
	
	
	@GetMapping ("/draftpick/undrafted")
	public List<DraftPickVO> getUndraftedPicks(){
		
		List<DraftPickVO> finalUndraftedList = new ArrayList<DraftPickVO>();
		List<DraftPick> draftPick= draftService.getUndraftedPlayers();
			draftPick.forEach(dp -> {
									  finalUndraftedList.add(
											  					new DraftPickVO(dp,playerService.findByPlayerID(dp.getPlayerID())));
			});
		
		return finalUndraftedList;
	}
}
