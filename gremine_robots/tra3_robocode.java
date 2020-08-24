package gremine_robots;

import java.awt.Color;

import robocode.AdvancedRobot;
import robocode.ScannedRobotEvent;

public class tra3_robocode extends AdvancedRobot 
 {
	public void run() 
   {
		setBodyColor(Color.black);
		setGunColor(Color.black);
		setScanColor(Color.red);
		setBulletColor(Color.cyan);
		

     while (true) 
        {
    	 setAhead(239);
    	 setTurnLeft(75);
    	 setAhead(300);
    	 setTurnGunRight(45);
    	 setTurnRight(75);
    	 setAhead(300);
    	 setTurnGunLeft(360);
		 execute();
	    }
     
   }
	    public void onScannedRobot(ScannedRobotEvent event) {
	    	fire(3);
	    }
		
   } 
