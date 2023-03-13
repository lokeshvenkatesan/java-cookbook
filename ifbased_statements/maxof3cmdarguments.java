package ifbased_statements;

public class maxof3cmdarguments {

	public static void main(String[] args) {
		if (args.length < 3) {
			System.err.println("Type in this way <A> <B> <C>");
			System.exit(1);
		}
		int A= Integer.parseInt(args[0]);
		int B= Integer.parseInt(args[1]);
		int C= Integer.parseInt(args[2]);
		 if (A > B && A > C)
		        System.out.println("A is bigger");
		    else if (B > C && B > A)
		        System.out.println("B is bigger");
		    else
		        System.out.println("C is bigger");
		}

}
//The error message is helpful because it tells the user how to correctly use the program (i.e., by passing three integer values as command-line arguments). The status code of 1 indicates that the program terminated abnormally due to an error condition. By convention, a status code of 0 indicates a normal termination of the program, while any non-zero status code indicates an error.