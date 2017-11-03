
public class Euler_021 {

	public static void main(String[] args) {	
		
		int number1, number2;
		int amicable = 0;
		
		for(int i = 1; i < 10000; i++) {
			number1 = sumaLiczb(i);
			number2 = sumaLiczb(number1);
			if(number2 == i && i != number1) amicable += i;			
		}
		
		System.out.println("Suma wszystkich liczb typu amicable \n w zakresie od 1 do 10000 wynosi: " +
		amicable);
	}
	
	public static int sumaLiczb(int liczba) {		
		int suma = 0;
		
		for(int i = 1; i <= liczba / 2; i++) {
			if(liczba % i == 0) suma += i;
		}
		return suma;
	}

}
