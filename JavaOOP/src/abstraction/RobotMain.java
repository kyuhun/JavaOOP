package abstraction;

public class RobotMain {
	public static void main(String[] args) {
		/* 
		6 		 GunRobot  
		7 		 ShiedRobot 
		8 		  
		9 		 출력 
		10 		 건로봇은 속도는 10, 에너지는 10, 공격력은 50  
		11 		 - 공격력은 인스턴스 변수로 int attackPoint 
		12 		 쉴드로봇은 속도는 20, 에너지는 20, 방어력은 50 
		13 		 - 방어력은 인스턴스 변수로 int shieldPoint  
		14 		  
		15 		 * */ 
				GunBot g = new GunBot(); 
				g.charge(10); 
				g.run(10); 
				g.setAttack(50); 
		 		g.status(); 
		 		ShieldRebot s = new ShieldRebot();
		 		s.charge(20);
		 		s.run(20);
		 		s.setShieldPoint(50);
		 		Robot [] robots = new Robot[2];
		 		robots[0] =g;
		 		robots[1] =s;
		 		for (Robot robot : robots) {
					
				}
		 		
}
}
	
