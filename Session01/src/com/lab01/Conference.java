package com.lab01;

public class Conference {
	private SessionPlanner sessionPlanner;
	
	public void setSessionPlanner(SessionPlanner sessionPlanner){
		this.sessionPlanner = sessionPlanner;
	}
	public int getNumberOf60MinSessions(){
		return sessionPlanner.get60MinSessionsCount();
	}
	public int getNumberOf50MinSessions(){
		return sessionPlanner.get50MinSessionsCount();
	}
	public int getNumberOf45MinSessions(){
		return sessionPlanner.get45MinSessionsCount();
	}
}
