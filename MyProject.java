import java.util.Scanner;

public class MyProject {

	public static void main(String[] args) {
		int n1, n2, sum;
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter the first number");
			n1=sc.nextInt();
			System.out.println("Enter the second number");
			n2=sc.nextInt();
			sum=n1+n2;
			System.out.println("The sum of the two numbers is  "+sum);
		}
	}

}