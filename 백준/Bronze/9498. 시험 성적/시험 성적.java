import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		if(A <= 100 &&  A >=90) { System.out.println("A");}
		else if (A>=80 && A<=89) {System.out.println("B");}
		else if (A<=79 && A >=70) {System.out.println("C");}
		else if (A<=69 && A >=60) {System.out.println("D");}
		else if(A<60) {System.out.println("F");}

	}
}