/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		int num_divided = Integer.parseInt(args[0]);
		
		// finding divisors of num_divided
		for(int i = 1; i <= num_divided; i++){
			if(num_divided % i == 0){
				System.out.println(i);
			}
		}
	}
}
