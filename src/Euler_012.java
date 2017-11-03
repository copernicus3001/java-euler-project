
public class Euler_012 {

	public static void main(String[] args) {
		
		int dzielnik;
		int triangle = 0;
		int i = 0;
		
		do {			
			i++;
			dzielnik = 1;
			triangle += i;
			
			for (int j = 1; j <= Math.sqrt(triangle); j++) 
					
				if (triangle % j == 0) dzielnik += 2;			
		}	
		while (dzielnik <= 500);	
			
		System.out.println(triangle);	
	}

}
//76576500