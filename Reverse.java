/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		if (args.length > 0){
			String my_str = args[0];
			for(int i = my_str.length() - 1; 0 <= i; --i){
				System.out.print(my_str.charAt(i));
			} 
			System.out.println();
	
			char middle;
			if ( my_str.length() % 2 == 0){
				middle = my_str.charAt((my_str.length() / 2) - 1);
			}
			else{
				middle = my_str.charAt(my_str.length() / 2);
			}
			System.out.println("The middle character is " + middle);
		}
		else{
			System.out.println("No string provided");
		}
	}
}
