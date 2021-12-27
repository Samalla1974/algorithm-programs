package algorithm_programs;

public class PrimeNumber {

	public static void main(String[] args) {
	int n = 1000;
	int rem,sum=0;
	for (int i=2; i<=n; ++i) {
		int count =0;
		for (int j=2; j<=i; ++j) {
			if(i%j == 0) {
				count++;
			}
		}
		int temp=i;
		if (count == 0) {
			System.out.println(i+"number is prime");
		}
	
		while (i != 0) {
			rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		if(i == sum) {
		System.out.println("prime number is palindrome");	
		}
		else {
			System.out.println("prime number is not a palindrome");
		}
		
	}
		
	
	
	}

	

}
