package com.tiankong.callback;

public class ArrayTest {
	
	public static void main(String[] args) {
		double[] d = {7.5, 6.2, 10.3, 0.21, 31.5, 14.9, 12.3};
		ArrayAlg.Pair p = ArrayAlg.minmax(d);
		System.out.println("min = " + p.getFirst());
		System.out.println("max = " + p.getSecond());
	}

}
