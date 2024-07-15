package com.corejava;

public class AsciiCodes {
	enum Season
	{
		WINTER,SPRING,SUMMER,FALL
	};

	public static void main(String[] args) {
//		char a ='A';		
//		System.out.println("Ascii value of A is: "+(int)a);
		System.out.println(Season.WINTER.ordinal());		
		System.out.println(Season.FALL.ordinal());
	}

}
