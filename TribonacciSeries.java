import java.util.HashMap;

public class TribonacciSeries {
	
	//this approach tries to solve the problem with DM

	public static int tribonacci(int n) {
        
		//initialize Hashmap with index and Tribonacci num we have already calculated
		
		HashMap<Integer, Integer> tribs = new HashMap<Integer, Integer>();
		
		tribs.put(0, 0);
		tribs.put(1,1);
		tribs.put(2,1);
		
		if(n == 0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 1;
		
		else {
			for(int i =3;i<=n;i++) {
				int a=tribs.get(i-1)+tribs.get(i-2)+tribs.get(i-3);
				tribs.put(i,a);
			}
		}
		int num=tribs.get(n);
        return num;
        
    }

	public static void main(String[] args) {
		
		int x = tribonacci(25);
		System.out.println(x);

	}

}
