import java.math.BigInteger;

public class Euler_015 {
	public static void main(String[] args) {	
		
		BigInteger odp;
		
		odp = silnia(40).divide(silnia(20)).divide(silnia(20));
		
		System.out.println(odp);		
	}	
	
	public static BigInteger silnia(long liczba) {	
		
		BigInteger wynik = BigInteger.valueOf(1);
				
		for(int i = 1; i <= liczba; i++){
			wynik = wynik.multiply(BigInteger.valueOf(i)); 
		}
		return wynik;
	}

}


