
public class LiczbaPierwsza {

	public long liczba;

	public LiczbaPierwsza(long n) {
		liczba = n;
	}
	
	public boolean testuj() {
	    if(liczba == 2) return true;
	    if(liczba % 2 == 0 || liczba == 1) return false;
	    long granica = (long)Math.sqrt(liczba);
	    for (int i = 3; i <= granica; i += 2)
	        if(liczba % i == 0) return false;
	    return true;
	}
	
}
