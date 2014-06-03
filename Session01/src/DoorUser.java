import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ds.Alarm;
import com.ds.Door;
import com.ds.DoorFactory;
import com.ds.SoundAlarm;

public class DoorUser {
	public static void main(String[] args) {
		ApplicationContext context = 
				new FileSystemXmlApplicationContext("bin/beans.xml");
		Door door = context.getBean("door",Door.class);
		//Door door = DoorFactory.getDoorWithSoundAlarm();
		door.open();
		door.close();
	}
}
