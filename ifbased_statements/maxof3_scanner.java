package ifbased_statements;

import java.util.Scanner;

public class maxof3_scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if (A > B && A > C)
		    System.out.println("A is bigger");
		else if (B > C && B > A)
		    System.out.println("B is bigger");
		else
		    System.out.println("C is bigger");
		sc.close();

	}

}
