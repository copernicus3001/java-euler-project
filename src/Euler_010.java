
public class Euler_010 {

    public static void main(String[] args)
    {   
    	long suma = 0;   	
    	
    	for(int i = 2; i < 2000000; i++) {
    		LiczbaPierwsza pierwsza = new LiczbaPierwsza(i);
			if(pierwsza.testuj()) suma += i;				
		}   
    	
    	System.out.println("Suma wszystkich liczb pierwszych w zakresie do 2000000, "
        		+ "wynosi: " + suma);	
    }

}

//142913828922