import java.util.ArrayList;
import java.util.List;

public class Even_Fibonacci_Numbers {

	static List<Integer> list = new ArrayList<Integer>();
	//static int sum = 0;
	
	public Even_Fibonacci_Numbers(List list) {
		// TODO Auto-generated constructor stub
		this.list = list;
	}
	
	
	/*
	 * public static int generateFibonacci(int n) {
		if(n<1) {
			return 0;
		}
		if(n==1)
			return 1;
		if(n==2)
			return 2 ;
	     return generateFibonacci(n-1) + generateFibonacci(n-2);
	}
	 * 
	 */
	public static void generateFibonacci() {
			//System.out.println(list.get(i-1));
		int i = 0;
		 int sum = 0;
			do{
				i++;
				System.out.println(i);
			if(i<3) {
				//System.out.print(i);
				list.add(i);
			} else {
				list.add(list.get(i-2)+list.get(i-3));
			}
			//System.out.print(",");
		}while(list.get(i-1)<4000000) ;
			
		for (Integer integer : list) {
			System.out.print(integer+ ",");
			System.out.println("---");
			if(integer%2 == 0) {
				sum += integer;
			}
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		generateFibonacci();
	//System.out.println(generateFibonacci(10));
	//System.out.println(sum);
	}
}
