package ex09.control2.for_;

public class Program {
	public static void main(String[] args) {
		int total = 0;
		for (int i = 0; i < 5; i++) {
			total += i+3;
		}
		//n*(a+l)/2
//		total = 5*(3+7)/2;
		
		//n*(2a+(n-1)d)/2
		total = 5*(2*3+(5-1)*1)/2;
		System.out.println(total);
	}
}
