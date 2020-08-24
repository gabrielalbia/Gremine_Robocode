package gremine_robots;

import robocode.util.Utils;
import robocode.AdvancedRobot;
import robocode.Rules;
import robocode.ScannedRobotEvent;

public class Gremine_radar_al1039 extends AdvancedRobot{
	
	public void run() {
		
		{ 
            setTurnRadarRightRadians( Double.POSITIVE_INFINITY );
            execute();
		}  while ( true );
		
	}
	
	public void onScannedRobot(ScannedRobotEvent e) {
	    double angleToEnemy = getHeadingRadians() + e.getBearingRadians();
	    double radarTurn = Utils.normalRelativeAngle( angleToEnemy - getRadarHeadingRadians() );
	    double extraTurn = Math.min( Math.atan( 36.0 / e.getDistance() ), Rules.RADAR_TURN_RATE_RADIANS );
	    if (radarTurn < 0)
	        radarTurn -= extraTurn;
	    else
	        radarTurn += extraTurn;
	    setTurnRadarRightRadians(radarTurn);
	    
	}
	

}
