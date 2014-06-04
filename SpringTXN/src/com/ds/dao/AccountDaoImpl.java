package com.ds.dao;

import org.springframework.stereotype.Repository;


@Repository("accountDao")
public class AccountDaoImpl extends BaseDaoSupport implements AccountDao {

	public void deposit(int accountNumber, int amount) {
		String sql = "update accounts set balance=balance+? where account_number=?";
		getJdbcTemplate().update(sql,amount,accountNumber);
	}

	public void withdraw(int accountNumber, int amount) {
		String sql = "update accounts set balance=balance-? where account_number=?";
		getJdbcTemplate().update(sql,amount,accountNumber);
	}
}
