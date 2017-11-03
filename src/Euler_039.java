
public class Euler_039 {

	public static void main(String[] args) {
		
		double c;
		int suma;
		int max = 0;
		int znacznik = 0;
		
		for(int p = 1; p <= 1000; p++) {
			suma = 0;
			for(int a = 1; a <= 999; a++) {
				for(int b = 1; b <= 999; b++) {
					c = Math.sqrt(a * a + b * b);
					if((a * a + b * b == c * c) && (a + b + c == p)) suma++;
				}
			}
			if(suma > max) {
				max = suma;
				znacznik = p;
			}		
		}

		System.out.println("Dla wyra¿enia a + b + c = " + znacznik + " wystêpuje najwiêksza liczba rozwi¹zañ \nrównania "
				+ "a * a + b * b = c * c");

	}
}
