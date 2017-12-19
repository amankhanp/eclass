package etoday;
import java.util.Scanner;
public class CelsiusToFahrenheit {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Double celsius,fahrenheit=0.0;
		System.out.println("Enter 0 to convert celsius-fahrenheit and 1 to convert fahrenheit-celsius : ");
		int enter= sc.nextInt();
		switch(enter){
		case 0 :
			System.out.print("Enter Celsius Number : ");
			celsius = sc.nextDouble();
			fahrenheit = (celsius * 9/5.0) + 32;
			System.out.println("Temperature in Fahrenhiet : "+fahrenheit);
			break;
		case 1 :
			System.out.print("Enter Fahrenhiet Number : ");
			fahrenheit = sc.nextDouble();
			celsius = (fahrenheit -32)* 5/9.0;
			System.out.println("Temperature in Celsius : "+celsius);
			break;
		default :
			System.out.println("Invalid option");
		}
	}
}
