package etoday;

public class PerfectNumber {
	public static void main(String args[]){
		for(int dividend=1;dividend<10001;dividend++){
			int sum=0;
			for(int divisor =1;divisor<dividend;divisor++){
				if(dividend%divisor==0){
					sum = sum + divisor;
				}
			}
			if(sum == dividend){
				System.out.println("It is Perfect Number : "+sum);
			}
		}
	}
}
