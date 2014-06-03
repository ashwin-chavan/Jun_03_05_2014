package com.ds;

public class DoorFactory {
	public static Door getDoorWithSoundAlarm(){
		Alarm alarm = new SoundAlarm();
		Door door = new Door();
		door.setAlarm(alarm);
		return door;
	}
}
