package com.check;

public class test {
	
	public void printme() {
		System.out.println("Printing from method");
		System.out.println("New print");
	}
	public static void main(String args[]) {
		System.out.println("From test class");
		test tt = new test();
		tt.printme();
				
	}

}
