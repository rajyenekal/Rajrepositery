package Lambda_Expressions;

public class Lamda_exp2 {
	public static void main(String[] args) {
		I1 j=(int a,int b)->{
			
			int c=a+b;
			
			System.out.println(c);
			
			return c;
			
		};
		
		j.m(20, 50);
		j.m(13, 38);
	}

}
