package com.ds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ds.dao.AccountDao;
import com.ds.dao.StatementDao;

@Service
public class AccountService {
	@Autowired
	private AccountDao accountDao;
	@Autowired
	private StatementDao statementDao;
	
	@Transactional(propagation=Propagation.REQUIRED,
			rollbackFor=Exception.class,isolation=Isolation.DEFAULT)	
	public void deposit(int accountNumber,String type, int amount)throws Exception {
		accountDao.deposit(accountNumber, amount);
		//stupid code 
		int i = 10;
		if(i % 2 == 0)
			throw new Exception("Stupid code has thrown an exception");
		statementDao.addStatement(accountNumber, type, amount);
	}
	public void withdraw(int accountNumber,String type, int amount) {
		accountDao.withdraw(accountNumber, amount);
		statementDao.addStatement(accountNumber, type, amount);
	}
	@Transactional(propagation=Propagation.NOT_SUPPORTED)
	public void deleteAllStatements(){
		statementDao.deleteAll();
	}
}




