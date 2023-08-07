package aerd;

public class object {
	
	
	public static void main(String[] args) {
		
		
		student s = new student();
		
		course  c1 = new course();
		
		c1.setCid(1);c1.setCname("java");c1.setCfee(1000); 
		
		
        course  c2 = new course();
		
		c2.setCid(2);c2.setCname("python");c2.setCfee(1000);
		
		
		course[]  cou = {c1,c2};
		
		s.setSid(1);
		
		s.setSname("    v. nithya prakash      ");
		
		s.setSquql("b.tech");
		
		s.setScou(cou);
		
		System.out.println(s.getSid());
		
		System.out.println(s.getSname());
		
		System.out.println(s.getSquql());
		
		s.getScou();
		for(int i=0;i<=cou.length-1;i++ ) {
			
			System.out.println(cou[i].getCid()+"---"+cou[i].getCname()+"---");
		}
	
	}

}
