package com.mphasis.training.daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mphasis.training.beans.Player;
import com.mphasis.training.conf.HibernateUtil;

public class PlayerdaoImpl {
	
	public void insertPlayer(Player player) {
		Transaction tr=null;
		Session session=null;
		try{
			session=HibernateUtil.getSessionFactory().openSession();
			tr=session.beginTransaction();
			session.save(player);
			tr.commit();	
		}catch(Exception e) {
			if(tr!=null) tr.rollback();
		}finally {
			session.close();
		}
		
		
	}
	
	public void updatePlayer(Player player) {
		Transaction tr=null;
		Session session=null;
		try{
			session=HibernateUtil.getSessionFactory().openSession();
			tr=session.beginTransaction();
			session.update(player);
			tr.commit();	
		}catch(Exception e) {
			if(tr!=null) tr.rollback();
		}finally {
			session.close();
		}
		
		
	}
	
	public void deletePlayer(int pid) {
		Transaction tr=null;
		Session session=null;
		try{
			session=HibernateUtil.getSessionFactory().openSession();
			tr=session.beginTransaction();
			Player player=(Player)session.get(Player.class, pid);
			session.delete(player);
			tr.commit();	
		}catch(Exception e) {
			if(tr!=null) tr.rollback();
		}finally {
			session.close();
		}
			
	}
	public Player getPlayerById(int pid) {
		Transaction tr=null;
		Session session=null;
		Player player=new Player();
		try{
			session=HibernateUtil.getSessionFactory().openSession();
			tr=session.beginTransaction();
			player=(Player)session.get(Player.class, pid);
			tr.commit();	
		}catch(Exception e) {
			if(tr!=null) tr.rollback();
		}finally {
			session.close();
		}
		return player;
	}
	
	public List<Player> getAll(){
		List<Player> players=new ArrayList<>();
		Transaction tr=null;
		Session session=null;
		try {
			session=HibernateUtil.getSessionFactory().openSession();
			tr=session.beginTransaction();
			players=session.createCriteria(Player.class).list();
			tr.commit();
		}catch(Exception e) {
			if(tr!=null)tr.rollback();
		}finally {
			session.close();
		}
		return players;
	}

}
