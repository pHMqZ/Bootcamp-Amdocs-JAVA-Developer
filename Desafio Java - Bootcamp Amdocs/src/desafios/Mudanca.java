package desafios;

import java.io.IOException;
import java.util.Scanner;

public class Mudanca {

	public static void main(String[] args) throws IOException {
		Scanner M = new Scanner(System.in);
		while (M.hasNext()) {
			int graus = M.nextInt();
			if (graus >= 0 && graus < 90 || graus == 360) {
				System.out.println("Bom Dia!!");
			} else if (graus == 90 && graus < 180) {
				System.out.println("Boa Tarde!!");
			} else if (graus == 180 && graus < 270) {
				System.out.println("Boa Noite!!");
			} else {
				System.out.println("De Madrugada!!");
			}
		}
		M.close();
	}
}
