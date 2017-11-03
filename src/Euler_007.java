
public class Euler_007 {

    public static void main(String[] args)
    {
    	long begin = System.currentTimeMillis();
    	    	
    	boolean znacznik = false; 
    	boolean	pierwsza = false;
    	int liczba = 3;
    	int suma = 2;
    	
    	do {    		
    		liczba++;
    		znacznik = true;
    		pierwsza = true;
    		
    		for(int i = 2; i <= liczba/2; i++)	{
	    	   
	    	   if(liczba % i == 0) znacznik = false;
	    	   if(znacznik == false) pierwsza = false;
	        }
    		if(pierwsza) suma++;    		
    	} while(suma <= 10000);
    	
    	System.out.print(suma + " liczba pierwsza to: " + liczba + "\n");
    	long end = System.currentTimeMillis();
		System.out.println("Czas realizacji programu to: " + (end - begin)/1000 + " sekund");	    	
    }

}
