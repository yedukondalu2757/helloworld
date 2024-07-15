package com.corejava;
import java.io.*;

public class RuntimeEx {

	public static void main(String[] args) {	
		Runtime rs = Runtime.getRuntime();
		try {
				rs.exec("notepad");
			}
		catch (IOException e) {
				System.out.println(e);
			}
		
	}

}
