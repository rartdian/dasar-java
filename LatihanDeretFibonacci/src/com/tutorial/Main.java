package com.tutorial;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		int fn, fn_min_1, fn_min_2, n;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("jumlah deret: ");
		n = input.nextInt();
		
		fn_min_2 = 0;
		fn_min_1 = 1;
		fn = 1;
		
		for (int i=1; i <= n; i++) {
			System.out.println("nilai ke - "+ i + " adalah "+ fn);
			fn = fn_min_1 + fn_min_2;
			fn_min_2 = fn_min_1;
			fn_min_1 = fn;
		}
		
		
	}

}
