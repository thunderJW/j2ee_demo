package com.tiankong.callback;

public class ArrayAlg {
	
	public static Pair minmax(double[] values) {
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		
		for(double v : values) {
			if (min > v) {
				min = v;
			}
			if (max <v) {
				max = v;
			}
		}
		
		return new Pair(min, max);
	}
	
	public static class Pair {
		
		private double first;
		private double second;
		
		public Pair(double f, double s) {
			this.first = f;
			this.second = s;
		}

		public double getFirst() {
			return first;
		}

		public void setFirst(double first) {
			this.first = first;
		}

		public double getSecond() {
			return second;
		}

		public void setSecond(double second) {
			this.second = second;
		}

	}

}
