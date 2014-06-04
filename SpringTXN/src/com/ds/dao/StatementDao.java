package com.ds.dao;

public interface StatementDao {
	void addStatement(int accountNumber,String type,int amount);
	void deleteAll();
}
