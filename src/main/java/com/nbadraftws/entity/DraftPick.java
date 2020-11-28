package com.nbadraftws.entity;
import javax.persistence.*;

@Entity
@Table(name="draft_pick")
public class DraftPick {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int draftid;
	
	@Column(name="round")
	private int round;
	
	@Column(name="pick")
	private int pick;
	
	@Column(name="drafted_team")
	private String draftedTeam;
	
	@Column(name="playerid")
	private String playerID;
	
	public DraftPick() {};
	public DraftPick(int draftid, int round, int pick, String draftedTeam, String playerID) {
		this.draftid = draftid;
		this.round = round;
		this.pick = pick;
		this.draftedTeam = draftedTeam;
		this.playerID = playerID;
	}

	public int getDraftid() {
		return draftid;
	}

	public void setDraftid(int draftid) {
		this.draftid = draftid;
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public int getPick() {
		return pick;
	}

	public void setPick(int pick) {
		this.pick = pick;
	}

	public String getDraftedTeam() {
		return draftedTeam;
	}

	public void setDraftedTeam(String draftedTeam) {
		this.draftedTeam = draftedTeam;
	}

	public String getPlayerID() {
		return playerID;
	}

	public void setPlayerID(String playerID) {
		this.playerID = playerID;
	}
	
	
	


	
}

	