package etoday;
import java.util.Scanner;
public class OrderedInfo {
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.print("ENTER FirstName,LastName,Designation,DOB : ");
			String first=sc.nextLine();
			System.out.println();
			System.out.println("You have entered : " +first);
			System.out.println();
			String seperatedList[] = first.split(",");
			
			for(String list : seperatedList){
				//System.out.println(list);
			}
			System.out.println("Entered First Name: "+seperatedList[0].toUpperCase());
			System.out.println("Entered Last Name: "+seperatedList[1].substring(0,1).toUpperCase()+seperatedList[1].substring(1));
			System.out.println("Entered Designation: "+seperatedList[2]);
			System.out.println("Entered DOB: "+seperatedList[3]);
	}
}
