package com.mphasis.training.bo;



import java.util.Date;
import java.util.List;

import com.mphasis.training.exceptions.BuissnesException;
import com.mphasis.training.pojo.Player;



public interface PlayerBO {
	public Player getPlayerById(int id) throws BuissnesException;
	public List<Player> getPlayersByGender(String gender) throws BuissnesException;
	public List<Player> getPlayersByAge(int age) throws BuissnesException;
	public Player getPlayerByEmail(String email) throws BuissnesException;
	public Player getPlayerByNumber(Long contact) throws BuissnesException;
	public List<Player> getPlayersByTeamname(String teamname) throws BuissnesException;
	public List<Player> getPlayersByName(String name) throws BuissnesException;
	public List<Player> getPlayersByDob(Date dob) throws BuissnesException;
	public void addPlayer(Player p)throws BuissnesException;
	public int deletePlayer(int id);
	public int updateScore(int id, long score);
	public List<Player> getAllPlayers()throws BuissnesException;
	

}
