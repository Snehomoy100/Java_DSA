package Patterns;

import java.util.Scanner;

public class CharPattern1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <=n; j++) {
				System.out.print((char)('A' + j - 1));
			}
			System.out.println();
		}
		input.close();
	}

}