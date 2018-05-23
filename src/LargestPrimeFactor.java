import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author Prabhat Shankar
 * prabhat.shnkr@gmail.com
 * 
 */
public class LargestPrimeFactor {

	public List<Long> factors;// = new ArrayList<Integer>();
	//public List<Long> primeFactors;// = new ArrayList<Integer>();
	
	public LargestPrimeFactor() {
		factors = new ArrayList<Long>();
		//primeFactors = new ArrayList<Long>();
	}
	
	public long factors(long n) {
		 long maxPrime = -1;
		 
	        while (n % 2 == 0) {
	            maxPrime = 2;
	 
	            n >>= 1;
	        }
	        for (int i = 3; i <= Math.sqrt(n); i += 2) {
	            while (n % i == 0) {
	                maxPrime = i;
	                n = n / i;
	            }
	        }
	        if (n > 2)
	            maxPrime = n;
	 
	        return maxPrime;
	}
	

	
	public static void main(String[] args) {
		LargestPrimeFactor obj = new LargestPrimeFactor();
		Long max=obj.factors(600851475143L);
		//Long max = obj.findPrimeFactors();
		System.out.println(max);
	}
	
	
}
