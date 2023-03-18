import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
	
		System.out.println(A*(B%10));	 //B/10 나머지
		System.out.println(A*(B%100/10)); //B(100/10) 나머지
		System.out.println(A*(B/100));	//B/100 몫
		System.out.println(A*B);
	}
}