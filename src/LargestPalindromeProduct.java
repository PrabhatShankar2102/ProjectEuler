/**
 * 
 */

/**
 * @author Prabhat Shankar
 * prabhat.shnkr@gmail.com
 * 
 */
public class LargestPalindromeProduct {

	int max ;
	/**
	 * 
	 */
	public LargestPalindromeProduct() {
		max=0;
	}
	public boolean isPalindrome(int x) {
		String s = Integer.toString(x);
		String s1 = new StringBuilder(s).reverse().toString();
		return (s.equals(s1));
	}
	public void multiply(int x, int y){
	while(x>99)	{	
	 for(int j =y;j>99;j--) {
		 int num = x*j;
		 if(isPalindrome(num)) {
			 max = Math.max(max, num);
		 }
	 	}
	 	x--;
	}
	System.out.println(max);
	}
	
	public static void main(String[] args) {
		LargestPalindromeProduct lpp = new LargestPalindromeProduct();
		lpp.multiply(999, 999);
	}
}
