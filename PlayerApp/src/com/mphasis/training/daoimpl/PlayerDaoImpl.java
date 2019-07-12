package com.mphasis.training.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.mphasis.training.dao.PlayerDao;
import com.mphasis.training.exceptions.BuissnesException;
import com.mphasis.training.pojo.Player;
import com.mphasis.training.util.DbUtil;

public class PlayerDaoImpl implements PlayerDao {
	private Connection conn;
	public PlayerDaoImpl() {
		conn=DbUtil.getConnection();
	}
	@Override
	public Player getPlayerById(int id)throws BuissnesException {
		Player p1=new Player();
		try {
		PreparedStatement pst=conn.prepareStatement("select * from player where pid=?");
		pst.setInt(1, id);
		ResultSet rs=pst.executeQuery();
		while(rs.next()) {
			p1.setPid(rs.getInt(1));
			p1.setName(rs.getString(2));
			p1.setGender(rs.getString(3));
			p1.setContact(rs.getLong(4));
			p1.setEmail(rs.getString(5));
			p1.setTeamname(rs.getString(6));
			p1.setAge(rs.getShort(7));
			p1.setDob(rs.getDate(8));
			p1.setScore(rs.getLong(9));
		}
		if(p1==null) {
			throw new BuissnesException("player not found for this id");
		}
		}catch(SQLException e) {
			throw new BuissnesException("sql error");
		}
		return p1;
	}
	@Override
	public List<Player> getPlayerByName(String name) {
		List<Player> players=new ArrayList<>();
		try {
			PreparedStatement pst=conn.prepareStatement("select * from player where name=?");
			pst.setString(1, name);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Player p1=new Player();
				p1.setPid(rs.getInt(1));
				p1.setName(rs.getString(2));
				p1.setGender(rs.getString(3));
				p1.setContact(rs.getLong(4));
				p1.setEmail(rs.getString(5));
				p1.setTeamname(rs.getString(6));
				p1.setAge(rs.getShort(7));
				p1.setDob(rs.getDate(8));
				p1.setScore(rs.getLong(9));
				players.add(p1);
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return players;
	}
	@Override
	public List<Player> getPlayerByGender(String gender) {
		List<Player> players=new ArrayList<>();
		try {
			PreparedStatement pst=conn.prepareStatement("select * from player where gender=?");
			pst.setString(1, gender);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Player p1=new Player();
				p1.setPid(rs.getInt(1));
				p1.setName(rs.getString(2));
				p1.setGender(rs.getString(3));
				p1.setContact(rs.getLong(4));
				p1.setEmail(rs.getString(5));
				p1.setTeamname(rs.getString(6));
				p1.setAge(rs.getShort(7));
				p1.setDob(rs.getDate(8));
				p1.setScore(rs.getLong(9));
				players.add(p1);
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return players;
	}
	@Override
	public Player getPlayerByContact(long contact) {
		Player p1=new Player();
		try {
			PreparedStatement pst=conn.prepareStatement("select * from player where contact=?");
			pst.setLong(1, contact);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				
				p1.setPid(rs.getInt(1));
				p1.setName(rs.getString(2));
				p1.setGender(rs.getString(3));
				p1.setContact(rs.getLong(4));
				p1.setEmail(rs.getString(5));
				p1.setTeamname(rs.getString(6));
				p1.setAge(rs.getShort(7));
				p1.setDob(rs.getDate(8));
				p1.setScore(rs.getLong(9));
				
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return p1;
	}
	@Override
	public List<Player> getPlayerByTeamname(String teamname) {
		List<Player> players=new ArrayList<>();
		try {
			PreparedStatement pst=conn.prepareStatement("select * from player where teamname=?");
			pst.setString(1, teamname);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Player p1=new Player();
				p1.setPid(rs.getInt(1));
				p1.setName(rs.getString(2));
				p1.setGender(rs.getString(3));
				p1.setContact(rs.getLong(4));
				p1.setEmail(rs.getString(5));
				p1.setTeamname(rs.getString(6));
				p1.setAge(rs.getShort(7));
				p1.setDob(rs.getDate(8));
				p1.setScore(rs.getLong(9));
				players.add(p1);
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return players;
	}
	@Override
	public List<Player> getPlayerByAge(int age) {
		List<Player> players=new ArrayList<>();
		try {
			PreparedStatement pst=conn.prepareStatement("select * from player where age=?");
			pst.setInt(1, age);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Player p1=new Player();
				p1.setPid(rs.getInt(1));
				p1.setName(rs.getString(2));
				p1.setGender(rs.getString(3));
				p1.setContact(rs.getLong(4));
				p1.setEmail(rs.getString(5));
				p1.setTeamname(rs.getString(6));
				p1.setAge(rs.getShort(7));
				p1.setDob(rs.getDate(8));
				p1.setScore(rs.getLong(9));
				players.add(p1);
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return players;
	}
	@Override
	public List<Player> getPlayerByDob(Date dob) throws BuissnesException {
		List<Player> players=new ArrayList<>();
		try {
			PreparedStatement pst=conn.prepareStatement("select * from player where dob=?");
			java.util.Date utilDate=dob;
			java.sql.Date sqlDate=new java.sql.Date(utilDate.getTime());
			pst.setDate(1, sqlDate);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Player p1=new Player();
				p1.setPid(rs.getInt(1));
				p1.setName(rs.getString(2));
				p1.setGender(rs.getString(3));
				p1.setContact(rs.getLong(4));
				p1.setEmail(rs.getString(5));
				p1.setTeamname(rs.getString(6));
				p1.setAge(rs.getShort(7));
				p1.setDob(rs.getDate(8));
				p1.setScore(rs.getLong(9));
				players.add(p1);
			}
			if(players.size()==0) {
				throw new BuissnesException("no player found for this dob");
			}
			}catch(SQLException e) {
				throw new BuissnesException("sql error");
			}
		return players;
	}
	@Override
	public List<Player> getPlayerByScore(int score) {
		List<Player> players=new ArrayList<>();
		try {
			PreparedStatement pst=conn.prepareStatement("select * from player where score=?");
			pst.setInt(1, score);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Player p1=new Player();
				p1.setPid(rs.getInt(1));
				p1.setName(rs.getString(2));
				p1.setGender(rs.getString(3));
				p1.setContact(rs.getLong(4));
				p1.setEmail(rs.getString(5));
				p1.setTeamname(rs.getString(6));
				p1.setAge(rs.getShort(7));
				p1.setDob(rs.getDate(8));
				p1.setScore(rs.getLong(9));
				players.add(p1);
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return players;
	}
	@Override
	public List<Player> getAllPlayers() {
		List<Player> players=new ArrayList<>();
		try {
			PreparedStatement pst=conn.prepareStatement("select * from player");

			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				Player p1=new Player();
				p1.setPid(rs.getInt(1));
				p1.setName(rs.getString(2));
				p1.setGender(rs.getString(3));
				p1.setContact(rs.getLong(4));
				p1.setEmail(rs.getString(5));
				p1.setTeamname(rs.getString(6));
				p1.setAge(rs.getShort(7));
				p1.setDob(rs.getDate(8));
				p1.setScore(rs.getLong(9));
				players.add(p1);
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return players;
	}
	@Override
	public void addPlayer(Player p) {
		try {
			String sql="insert into player values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setInt(1, p.getPid());
			ps.setString(2, p.getName());
			ps.setString(3, p.getGender());
			ps.setLong(4, p.getContact());
			ps.setString(5, p.getEmail());
			ps.setString(6, p.getTeamname());
			ps.setInt(7, p.getAge());
			java.util.Date dob=p.getDob();
			java.sql.Date dob1=new java.sql.Date(dob.getTime());
			ps.setDate(8, dob1);
			ps.setLong(9, p.getScore());
			ps.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Override
	public int deletePlayer(int id) {
		int i=0;
		try {
			PreparedStatement ps=conn.prepareStatement("delete player from pid=?");
			ps.setInt(1, id);
			i=ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	@Override
	public int updateScore(int id, long score) {
		int i=0;
		try {
			PreparedStatement ps=conn.prepareStatement("update player set score=? where pid=?");
			ps.setLong(1, score);
			ps.setInt(2, id);
			i=ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	@Override
	public Player getPlayerByEmail(String email) {
		Player p1=new Player();
		try {
			PreparedStatement pst=conn.prepareStatement("select * from player where email=?");
			pst.setString(1, email);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				
				p1.setPid(rs.getInt(1));
				p1.setName(rs.getString(2));
				p1.setGender(rs.getString(3));
				p1.setContact(rs.getLong(4));
				p1.setEmail(rs.getString(5));
				p1.setTeamname(rs.getString(6));
				p1.setAge(rs.getShort(7));
				p1.setDob(rs.getDate(8));
				p1.setScore(rs.getLong(9));
				
			}
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return p1;
	}
	
}
