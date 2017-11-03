
public class Euler_014 {

	public static void main(String[] args) {	
		
		long maks = 0, liczn = 0, szukana = 0;
				
		for (int i = 1; i <= 1000000; ++i) {
			liczn = collatz(i);
			if	(liczn > maks) { 
				maks = liczn; 
				szukana = i;
			}
		}	
		System.out.println("Maksymalna d³ugoœæ ³añcucha to " + maks + 
				" dla liczby = " + szukana);
	}	
	
	public static int collatz (long liczba) {
		
		int licznik = 1;
		while (liczba != 1) {
			if (liczba % 2 == 0) liczba = liczba / 2;
			else liczba = liczba * 3 + 1;
			++licznik;	
		}
		return licznik;			
	}
}
