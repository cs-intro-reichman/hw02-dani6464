/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);

		int my_sum = 1;

		// I know there's a replica of the same code, but we have'nt learned functions yet.
		// checks if the number is perfect
		for (int i = 2; i < num; i ++){
			if (num % i == 0){
				my_sum += i;
			}}
		
		// if the number is perfect or not print accordingly 
		if (my_sum == num){
				System.out.print(num + " is a perfect number since " + num + " = 1");
				for (int j = 2; j < num; j ++){
					if (num % j == 0){
						System.out.print(" + " + j);
					}
				}
			}
		else{
				System.out.print(num + " is not a perfect number");
			}
			}

			

		}
