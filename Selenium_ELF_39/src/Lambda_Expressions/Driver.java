package Lambda_Expressions;

public class Driver {
	public static void main(String[] args) {
		
		//Lambda expression
		I i=(int a,int b)->{
			int e=a+b;
			System.out.println(e);
			
		};
		
		i.m(23,54);
		i.m(40, 60);
		
	}
}
