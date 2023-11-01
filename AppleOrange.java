
/**
* A public class that will print the numbers 1 to a user input.
* It will then print out "apple" for multiples of 3, "orange" for 
* multiples of 7, and "appleorange" for multiples of both.
*@author Starling Devine
**/
public class AppleOrange{
	
	/**
	* A main method that takes in a command line argument that 
	* is used to determine the number to stop counting at. The method 
	* first verifys that the command line argument consists of a single positive integer.
	* Then it prints out the number, apple, orange, or appleorange based on whether the integer is a mulitple of 3, 7, or both. 
	*@param args a singular positive integer taken from the command line.
	**/
	public static void main(String[] args){
		boolean contin = true;
		while(contin){
			if(args.length <1 || args.length >1){
				System.err.print("One positive number required as a command line argument.\nExample Usage: java AppleOrange [number]");
				contin = false;
				break;
			}
			int input = 0;
			try{
				input = Integer.parseInt(args[0]);
			}
			catch(Exception e){
				System.err.print("One positive number required as a command line argument.\nExample Usage: java AppleOrange [number]");
				contin = false;
				break;
			}
			if(input<1){
				System.err.print("One positive number required as a command line argument.\nExample Usage: java AppleOrange [number]");
				contin = false;
				break;
			}
			
			boolean mulitOf3 = false, multiOf7 = false;
			
			for(int i = 1; i <= input; i ++){
				mulitOf3 = (i%3 == 0);
				multiOf7 = (i%7 == 0);
				if(mulitOf3 && multiOf7){
					System.out.print("appleorange ");
				}
				else if(mulitOf3){
					System.out.print("apple ");
				}
				else if(multiOf7){
					System.out.print("orange ");
				}
				else{
					System.out.print(i+ " ");
				}
			}
			contin = false;
		}
	}
}

//javac -cp .;junit-4.11.jar;004-sdevine4-p0/ AppleOrangeTest.java
//java -cp .;junit-4.11.jar;004-sdevine4-p0/ AppleOrangeTest
