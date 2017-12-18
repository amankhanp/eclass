package etoday;
import java.util.*;
public class GuessNumber {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int defaultvalue = 37;
		boolean x = false;
		while(x == false){
			System.out.print("Enter Guess Number : ");
			int guessno = sc.nextInt();
			if(defaultvalue == guessno){
				System.out.print("Guessed number is correct "+guessno);
				x= true;
			}
			else if(defaultvalue < guessno){
				System.out.println("Please enter the value lesser than "+guessno);
			}
			else if(defaultvalue > guessno){
				System.out.println("Please enter the value greater than "+guessno);
			}
		}
	}
}
