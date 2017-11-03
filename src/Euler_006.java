public class Euler_006 {

	public static void main(String[] args) {
		
		int suma = 0;
		int kwadrat = 0;
				
		for(int i = 1; i <= 100; i++)	suma += i; 
								
		for(int d = 1; d <= 100; d++)	kwadrat += d*d; 
		
		System.out.println("Kwadrat sumy pierwszych 100 liczb minus suma kwadratów"
				+ " pierwszych 100 liczb wynosi: " + (suma * suma - kwadrat));
	}

} // 25164150
