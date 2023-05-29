
public class Primer {
	
	/*calcultes sum of first n elements
	 * 
	 * n needs to be a positive number
	 * 
	 * */
	
	public int sum(int n) {
		int result = 0;
		for(int i = 1; i <= n; i++) {
			result += i;
		}
		return result;
	}

}
