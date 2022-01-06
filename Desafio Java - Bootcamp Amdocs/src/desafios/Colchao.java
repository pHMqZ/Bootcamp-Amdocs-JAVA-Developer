package desafios;

import java.io.IOException;
import java.util.Scanner;

public class Colchao {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int H = sc.nextInt();
		int L = sc.nextInt();

		if (A <= H && B <= L) {
			System.out.println("S");
		} else if (A <= H && C <= L) {
			System.out.println("S");
		} else if (B <= H && A <= L) {
			System.out.println("S");
		}else if (B <= H && C <= L) {
			System.out.println("S");
		}else if (C <= H && A <= L) {
			System.out.println("S");
		}else if (C <= H && B <= L) {
			System.out.println("S");
		} else {
			System.out.println("N");
		}
		
		sc.close();
	}
}