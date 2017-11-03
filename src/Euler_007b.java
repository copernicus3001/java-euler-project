
public class Euler_007b {

    public static void main(String[] args)
    {   
    	int suma = 0;
    	int i = 0;
    	
    	do {
    		i++;
	    	LiczbaPierwsza pierwsza = new LiczbaPierwsza(i);
			if(pierwsza.testuj()) suma++;				
		} while(suma < 10001);
    	
		System.out.println("To jest 10001 liczba pierwsza " + i);		
    }

}
 //What is the 10 001st prime number?