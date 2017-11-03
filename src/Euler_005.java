public class Euler_005 {
	public static void main(String[] args) {
		
		int znacznik = 0;
		int liczba = 1;
		long begin = System.currentTimeMillis();
		
		while(znacznik == 0) {
			liczba++;
			for(int i = 2; i <= 20; i++) {
				if(liczba % i != 0) {
					znacznik = 0;
					break;
				} else znacznik = 1;				
			}			
		}
		
		System.out.println("liczba = " + liczba);
		long end = System.currentTimeMillis();
		System.out.println("Czas trwania programu: " + (end - begin)*1.0/1000 + " sekund");
	}

}
//232792560
/*2520 is the smallest number that can be divided by each of the numbers 
 * from 1 to 10 without any remainder. What is the smallest positive number 
 * that is evenly divisible by all of the numbers from 1 to 20?
*/
