public class Euler_009 {

	public static void main(String[] args) {
		
		for(int a = 1; a <= 998; a++) {
			for(int b = 1; b <= 998; b++) {
				for(int c = 1; c <= 998; c++) {
					
					if(a * a + b * b == c * c) {
						if(a + b + c == 1000) System.out.println(a * b * c);
					}
				}
			}
		}
	}

} //31875000
