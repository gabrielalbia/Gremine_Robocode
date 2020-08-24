package gremine_robots;

import robocode.AdvancedRobot;
import robocode.HitByBulletEvent;
import robocode.HitWallEvent;
import robocode.ScannedRobotEvent;
import robocode.util.Utils;

public class tra4_robocode extends AdvancedRobot  {
	
	public void run() {
		{turnRadarRightRadians(0);
		scan();
		}
	 while (true) {
		ahead(130);
		turnLeft(25);
		turnGunLeft(360);
		ahead(140);
		turnRight(27);
		ahead(128);
		}
	}
	
	public void onScannedRobot(ScannedRobotEvent e) {
	    setTurnRadarRight(2.0 * Utils.normalRelativeAngleDegrees(getHeading() + e.getBearing() - getRadarHeading()));
	    setTurnGunRightDegrees(getHeight()+ e.getBearing() - getRadarHeading());
	fire(4);
	}
	

	public void onHitByBullet(HitByBulletEvent event) {
	 back(45);
	 turnLeft(45);
	}
	
	public void onHitWall(HitWallEvent event) {
		back(70);
		turnLeft(45);
		ahead(35);
	}

}

