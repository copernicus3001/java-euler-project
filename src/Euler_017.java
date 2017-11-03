
public class Euler_017 {
	public static void main(String[] args) {
/*		
		one, two, three, four, five
		three hundred and forty-two
		one hundred and fifteen*/
		
		int suma = 0;
		int temp = 0;
		
		for(int liczba = 1; liczba <= 1000; liczba++) {	
			
			if(liczba >= 1000) suma += 11;	//one thousand
			else if(liczba % 100 == 0 && liczba != 1000) suma += liczbaJ(liczba/100) + 7; //hundred
			else if(liczba % 10 == 0 && liczba < 100) suma += liczbaD(liczba/10); //pojedyncze dziesi¹tki
			else if(liczba <= 999 && liczba >= 101 && liczba % 100 != 0) {
				suma += liczbaJ((liczba - liczba % 100) / 100) + 7 + 3;
				temp = liczba % 100;
				if(temp >= 21 && temp <= 99 && temp % 10 != 0) 
					suma += liczbaD((temp - (temp % 10)) / 10) + liczbaJ(temp % 10); 	
				else if(temp % 10 == 0 && temp < 100) suma += liczbaD(temp/10);
				else if(temp <= 19 && temp >= 11) suma += liczbaJD(temp);	//liczby od 11 do 19
				else if(temp <= 9) suma += liczbaJ(temp);	//liczby od 1 do 9
			}
			else if(liczba >= 21 && liczba <= 99 && liczba % 10 != 0) 
				suma += liczbaD((liczba - (liczba % 10)) / 10) + liczbaJ(liczba % 10); 			
			else if(liczba <= 19 && liczba >= 11) suma += liczbaJD(liczba);	//liczby od 11 do 19
			else if(liczba <= 9) suma += liczbaJ(liczba);	//liczby od 1 do 9
			
		}
		System.out.println("Suma liter w liczebnikach angielskich\n" + " w zakresie od 1 do "
				+ "1000 wynosi: " + suma);

		
		
	}
	public static int liczbaJ(int j) {
		
		int number = 0;
		
		switch(j) {
			case 0: number = 0; //zero
					break;
			case 1: number = 3; //one
					break;
			case 2: number = 3; //two
					break;
			case 3: number = 5; //three
					break;
			case 4: number = 4; //four
					break;	
			case 5: number = 4; //five
					break;	
			case 6: number = 3; //six
					break;	
			case 7: number = 5; //seven
					break;
			case 8: number = 5; //eight
					break;	
			case 9: number = 4; //nine
					break;	
		}
			return number;
	}
	
	public static int liczbaJD(int j) {
		
		int number = 0;
		
		switch(j) {
			case 11: number = 6; //eleven
					break;
			case 12: number = 6; //twelve
					break;
			case 13: number = 8; //thirteen
					break;
			case 14: number = 8; //fourteen
					break;	
			case 15: number = 7; //fifteen
					break;	
			case 16: number = 7; //sixteen
					break;	
			case 17: number = 9; //seventeen
					break;
			case 18: number = 8; //eighteen
					break;	
			case 19: number = 8; //nineteen
					break;	
		}
			return number;
	}
	
	public static int liczbaD(int j) {
			
			int number = 0;
			
			switch(j) {
				case 1: number = 3; //ten
						break;
				case 2: number = 6; //twenty
						break;
				case 3: number = 6; //thirty
						break;
				case 4: number = 5; //forty
						break;	
				case 5: number = 5; //fifty
						break;	
				case 6: number = 5; //sixty
						break;	
				case 7: number = 7; //seventy
						break;
				case 8: number = 6; //eighty
						break;	
				case 9: number = 6; //ninety
						break;	
			}
				return number;
		}

}

/*	 
	
100 a (one) hundred	
101 a (one) hundred and one	
102 a (one) hundred and two	
200 two hundred	200 - two hundred
300 - three hundred
400 - four hundred
500 - five hundred
600 - six hundred
700 - seven hundred
800 - eight hundred
900 - nine hundred
253 two hundred and fifty-three	
1000 a (one) thousand
 */