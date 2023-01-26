package Blentin__Tosuni;
import robocode.*;


public class Siport46 extends JuniorRobot
{

	public void run() {
		
		setColors(orange, blue, white, yellow, green);

	
		while(true) {
		
			turnGunRight(360);
			ahead(100);
			turnGunRight(360);
			ahead(50);
			turnRight(10);
			back(100);
			ahead(50);
			
			
			
		}
	}


	public void onScannedRobot() {
		
		turnGunTo(scannedAngle + scannedVelocity/2);
		if(scannedDistance < 100)
		{
			fire(3);
		}
		if(scannedDistance < 100)
		{
			fire(3);
		}
		else
		{
			fire(1.8);
		}
	}


	public void onHitByBullet() {
	
		ahead(100);
		back(30);
		
	}
	

	public void onHitWall() {
	
		turnRight(20);
		ahead(120);

	}	
	 void onHitRobot(HitRobotEvent event) {
      
		 if (event.getBearing() > -90 && event.getBearing() <= 90) {
           back(100);}
       	 else {
           ahead(100);
       }
   }
}
