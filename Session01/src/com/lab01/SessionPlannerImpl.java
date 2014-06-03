package com.lab01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SessionPlannerImpl implements SessionPlanner {
	private Map<String, String> allSessions;
	public SessionPlannerImpl(Map<String,String> allSessions){
		this.allSessions = allSessions;
		organizeSessions();
	}
	private void organizeSessions(){
		sessions60Min = new ArrayList<String>();
		sessions50Min = new ArrayList<String>();
		sessions45Min = new ArrayList<String>();
		Iterator<String> itr = allSessions.values().iterator();
		while(itr.hasNext()){
			String session = itr.next();
			String[] temp = session.split("-");
			if(temp[1].contains("45"))
				sessions45Min.add(temp[0]);
			else if(temp[1].contains("50"))
				sessions50Min.add(temp[0]);
			else if(temp[1].contains("60"))
				sessions60Min.add(temp[0]);
		}
	}
	private List<String> sessions60Min,sessions50Min,sessions45Min;
	
	public int get60MinSessionsCount() {
		return sessions60Min.size();
	}

	public int get50MinSessionsCount() {
		return sessions50Min.size();
	}

	public int get45MinSessionsCount() {
		return sessions45Min.size();
	}

}
