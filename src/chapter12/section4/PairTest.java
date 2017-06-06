package chapter12.section4;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class PairTest {
	public static void main(String[] args)
	{
		GregorianCalendar[] birthday = 
			{
					new GregorianCalendar(1906,Calendar.DECEMBER,9),
					new GregorianCalendar(1815,Calendar.OCTOBER,11),
					new GregorianCalendar(1903,Calendar.SEPTEMBER,13),
					new GregorianCalendar(2016,Calendar.MAY,21),
			};
		Pair<GregorianCalendar> mm = ArrayAlg.minmax(birthday);
		System.out.println("min = " + mm.getFirst().getTime());
		System.out.println("max = " + mm.getSecond().getTime());
	}
}


class ArrayAlg
{
	public static  <T extends Comparable> Pair<T> minmax(T[] a)  // 有限定的泛型和泛型方法
	{
		T min = a[0];
		T max = a[0];
		for(int i = 1; i < a.length; i++)
		{
			if(min.compareTo(a[i]) > 0) min = a[i];
			if(max.compareTo(a[i]) < 0) max = a[i];
		}
		return new Pair<T>(min,max);
	}
}