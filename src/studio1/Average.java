package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("The first 2 integers to be averaged?");
		double n1 = in.nextInt();
		double n2 = in.nextInt();
		System.out.println((n1+n2)/2);
	}

}
