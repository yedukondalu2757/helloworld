package com.corejava;
import java.util.regex.*;

public class RegexEx {

	public static void main(String[] args) {
		System.out.println(Pattern.matches(".s..", "isha"));
		System.out.println(Pattern.matches(".s", "vinu"));   
		System.out.println(Pattern.matches(".s", "moon"));  
		System.out.println(Pattern.matches(".s", "anuj"));  
		System.out.println(Pattern.matches("...s.", "krish"));

	}

}