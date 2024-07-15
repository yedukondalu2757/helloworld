package com.corejava;

import java.util.Scanner;

public class LeapYearEx {

	public static void main(String[] args) {
		int year;
		 
        System.out.println("Give the random year");
        Scanner scn = new Scanner(System.in);
        year = scn.nextInt();
 
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
 
            System.out.println(year + " : Leap Year");
        }
 
        else {
            System.out.println(year + " : Non - Leap Year");
        }
	}

}
