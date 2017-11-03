
public class Euler_001 {
	public static void main(String[] args) {
		
		int suma = 0;
		
		for(int i=1; i<=999; i++) {
			if(((i % 3) == 0) || (i % 5) == 0) {
				suma += i;
			}
		}
		
		System.out.println("Suma liczb z zakresu od 1 do 999 i dziel�cych si� "
				+ "bez reszty przez 3 lub 5 wynosi: " + suma);		
	}

}

/*If we list all the natural numbers below 10 that are multiples of 3 or 5, 
  we get 3, 5, 6 and 9. The sum of these multiples is 23.
  Find the sum of all the multiples of 3 or 5 below 1000.*/

// 233168