/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		// prints first num
		double num_double = 10.0 * Math.random();
		int num_int = (int) Math.round(num_double);
		System.out.print(num_int);

		double num_2_double;
		int num_2_int;
		
		// prints another int if it's equal or larger than num_1
		do{
			num_2_double = 10.0 * Math.random();
			num_2_int = (int) Math.round(num_2_double);

			if (num_int <= num_2_int){
				System.out.print(" " + num_2_int);
				num_int = num_2_int;
			}
		}while (num_int <= num_2_int);
	}
}
