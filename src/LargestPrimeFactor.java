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
	public List<Long> primeFactors;// = new ArrayList<Integer>();
	
	public LargestPrimeFactor() {
		factors = new ArrayList<Long>();
		primeFactors = new ArrayList<Long>();
	}
	
	//get all the factors first
	public long factors(long n) {
		 long maxPrime = -1;
		 
	        // Print the number of 2s
	        // that divide n
	        while (n % 2 == 0) {
	            maxPrime = 2;
	 
	            // equivalent to n /= 2
	            n >>= 1;
	        }
	 
	        // n must be odd at this point,
	        // thus skip the even numbers
	        // and iterate only for odd
	        // integers
	        for (int i = 3; i <= Math.sqrt(n); i += 2) {
	            while (n % i == 0) {
	                maxPrime = i;
	                n = n / i;
	            }
	        }
	 
	        // This condition is to handle
	        // the case when n is a prime
	        // number greater than 2
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
