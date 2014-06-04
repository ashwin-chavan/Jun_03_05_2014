package com.ds.dao;

import org.springframework.stereotype.Repository;


@Repository("statementDao")
public class StatementDaoImpl extends BaseDaoSupport implements StatementDao {

	public void addStatement(int accountNumber, String type, int amount) {
		String sql = "insert into statements(account_number,amount,type) values(?,?,?)";
		getJdbcTemplate().update(sql,accountNumber,amount,type);
	}
	public void deleteAll(){
		getJdbcTemplate().update("delete from statements");
	}
}
