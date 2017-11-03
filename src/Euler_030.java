
public class Euler_030 {
	public static void main(String[] args) {		
		
		int liczba, root = 0;
		int suma = 0;
		
		for(int x=0; x<=9; x++) {
			for(int a=0; a<=9; a++) {
				for(int b=0; b<=9; b++) {
					for(int c=0; c<=9; c++) {
						for(int d=0; d<=9; d++) {
							for(int e=0; e<=9; e++) {
								liczba = x*x*x*x*x + a*a*a*a*a + b*b*b*b*b + c*c*c*c*c 
										+ d*d*d*d*d + e*e*e*e*e;
								root = x*100000 + a*10000 + b*1000 + c*100 + d*10 + e;
								if (liczba==root) suma+=liczba;								
							}
						}
					}
				}	 
			}
		}
		System.out.println(suma-1);		
	}

}