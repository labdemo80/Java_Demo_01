package com;

class Calc{
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}

public class Main {
	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.add(10, 20);
	}
}
