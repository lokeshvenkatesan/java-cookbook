package ifbased_statements;


public class maxof3 {

	public static void main(String[] args) {
//		Scanner sc= System.in();
		int A = 10;
		int B = 20;
		int C = 25;
		if (A > B && A > C)
			System.out.println("A is bigger");
		if (B > C && B > A)
			System.out.println("B is bigger");
		else
			System.out.println("C is bigger");
	}

}
