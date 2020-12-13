package com.nbadraftws.vo;

import com.nbadraftws.entity.DraftPick;
import com.nbadraftws.entity.Player;

public class DraftPickVO {
	
	private DraftPick draftPick;
	private Player player;
	
	public DraftPickVO (){}
	
	public DraftPickVO(DraftPick draftPick, Player player) {
		this.draftPick = draftPick;
		this.player = player;
	}

	public DraftPick getDraftPick() {
		return draftPick;
	}

	public void setDraftPick(DraftPick draftPick) {
		this.draftPick = draftPick;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
}
