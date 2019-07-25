package com.mphasis.training;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mphasis.training.beans.Account;
import com.mphasis.training.beans.CurrentAccount;
import com.mphasis.training.beans.SavingsAccount;
import com.mphasis.training.conf.HibernateUtil;

public class AccountApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Account a1=new Account();
		a1.setName("Rashmi");
		
		SavingsAccount a2=new SavingsAccount();
		a2.setName("Supragana");
		a2.setBalance(66867);
		a2.setAcc_date(new Date());
		
		CurrentAccount a3=new CurrentAccount();
		a3.setName("Priya");
		a3.setType("CA");
		
		session.save(a1);
		session.save(a2);
		session.save(a3);*/
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.get(Account.class, 1);
		
		
		tr.commit();
		session.close();
		
		Session session1=sf.openSession();
		Transaction tr1=session1.beginTransaction();
		session1.get(Account.class, 1);
		
				tr1.commit();
		session1.close();
		
		
	}

}
