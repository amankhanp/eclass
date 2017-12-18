package etoday;

import java.util.Scanner;

public class ShiftOperators {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Left shift value : ");
		int first = sc.nextInt();
		System.out.println("Enter Right shift value : ");
		int second = sc.nextInt();
		int left = first<<1;
		int right = second>>1;
		System.out.println("The multiplied value of left and right shift's is : " +first*+second);
//		System.out.println(left);
//		System.out.println(right);
	}
}
