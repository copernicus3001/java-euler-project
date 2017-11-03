
public class Euler_045_no {

	public static void main(String[] args) {
		
		int n = 5000;
		long[] triangleTab = new long[n+1]; 
		long[] pentagonalTab = new long[n+1];
		long[] hexagonalTab = new long[n+1];
		
		for (int i = 0; i <= n; i++) {
			
			triangleTab[i] = i * (i + 1) / 2;
			pentagonalTab[i] = i * (3 * i -1) / 2;
			hexagonalTab[i] = i * (2 * i -1);
		}

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				for (int k = 0; k <= n; k++) {
					
					if ((triangleTab[k] == pentagonalTab[j]) && (triangleTab[k] == hexagonalTab[i])) 
					
						System.out.println("Wynik to: " + hexagonalTab[i]);
					 
					
				}
			}
	
		}
	 }
}



