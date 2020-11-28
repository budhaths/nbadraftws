package com.nbadraftws.entity;
import javax.persistence.*;

@Entity
@Table(name="player_info")
public class Player {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="playerid")
	private int playerid;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="position")
	private String position;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="school_team")
	private String schoolTeam;

	public Player () {
		
	}
	
	public Player(int playerid, String firstName, String lastName, String position, String nationality,
			String schoolTeam) {
		this.playerid = playerid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.position = position;
		this.nationality = nationality;
		this.schoolTeam = schoolTeam;
	}

	public int getPlayerid() {
		return playerid;
	}

	public void setPlayerid(int playerid) {
		this.playerid = playerid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getSchoolTeam() {
		return schoolTeam;
	}

	public void setSchoolTeam(String schoolTeam) {
		this.schoolTeam = schoolTeam;
	}
	
	
	
}
