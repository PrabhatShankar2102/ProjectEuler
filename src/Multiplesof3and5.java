import java.util.ArrayList;

/**
 * @author Prabhat Shankar
 * prabhat.shnkr@gmail.com
 * 
 */
public class Multiplesof3and5 {
	public ArrayList<Integer> list ;
	public Multiplesof3and5(ArrayList<Integer> list) {
		this.list = list ;
	}
	
	public void multiple(int n) {
		for (int i =0;i<n ; i++) {
			if(i%3 == 0 || i%5 == 0) {
				list.add(i);
			}
		}
	}
	public void sum(ArrayList<Integer> arr) {
		int sum = 0 ;
		for (Integer integer : arr) {
			sum += integer;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		Multiplesof3and5 obj = new Multiplesof3and5(list);
		int n = 1000 ;
		obj.multiple(n);
		obj.sum(list);
		
	}
}
