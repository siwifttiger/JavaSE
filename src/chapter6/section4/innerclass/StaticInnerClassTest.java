package chapter6.section4.innerclass;

public class StaticInnerClassTest {
	public static void main(String[] args)
	{
		double[] d = new double[20];
		for(int i = 0; i < d.length; i++)
			d[i] = Math.random();
		ArrayAlg.Pair p = ArrayAlg.minmax(d);
		for(double v : d)
			System.out.println(v);
		System.out.println("min value: " + p.getMin());
		System.out.println("max value: " + p.getMax());
	}
	
}

class ArrayAlg
{
	public static class Pair
	{
		private double min;
		private double max;
		
		public Pair(double min, double max)
		{
			this.min = min;
			this.max = max;
		}

		public double getMin() {
			return min;
		}

		public double getMax() {
			return max;
		}
	}
	
	public static Pair minmax(double[] d)
	{
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		
		for(double v : d)
		{
			if(v < min) min = v;
			if(v > max) max = v;
		}
		
		return new Pair(min,max);
	}
}
