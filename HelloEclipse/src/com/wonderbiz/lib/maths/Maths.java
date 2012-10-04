package com.wonderbiz.lib.maths;

public class Maths {

	private int _num1;
	private int _num2;
	
	public Maths(int a, int b)
	{
		_num1= a;
		_num2 = b;
	}
	
	public int add()
	{
		return (_num1 + _num2);
	}

	public int subtract()
	{
		return (_num1 - _num2);
	}
}
