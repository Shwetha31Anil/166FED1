package com.mphasis.training.dao;

import java.util.Date;
import java.util.List;

import com.mphasis.training.exceptions.BuissnesException;
import com.mphasis.training.pojo.Player;

public interface PlayerDao {
	public Player getPlayerById(int id) throws BuissnesException;
	public List<Player> getPlayerByName(String name)throws BuissnesException;
	public List<Player> getPlayerByGender(String gender)throws BuissnesException;
	public Player getPlayerByContact(long contact)throws BuissnesException;
	public List<Player> getPlayerByTeamname(String teamname)throws BuissnesException;
	public List<Player> getPlayerByAge(int age)throws BuissnesException;
	public List<Player> getPlayerByDob(Date dob) throws BuissnesException;
	public List<Player> getPlayerByScore(int score)throws BuissnesException;
	public List<Player> getAllPlayers()throws BuissnesException;
	public void addPlayer(Player p);
	public int deletePlayer(int id);
	public int updateScore(int id, long score);
	public Player getPlayerByEmail(String email);

}
