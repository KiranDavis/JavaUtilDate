package JavaUtilDateExample;
import java.util.*;
public class JUDex 
{
	@SuppressWarnings("deprecation")
	public static void main(String args[])
	{
		Date md= new Date();
		System.out.println("System Date: "+md.toString());
		md.setTime(15680);
		System.out.println("Time after setting: "+md.toString());
		int d= md.hashCode();
		System.out.println("Amount (in ms) by which time"+" is shifted: "+d);
		Date d1= new Date(2020, 01, 06);
		Date d2= new Date(2019, 12, 25);
		boolean a= d2.after(d1);
		System.out.println("Is Date2 is after Date1: "+a);
		a= d1.after(d2);
		System.out.println("Is date1 is after date2: "+a);
		System.out.println("");
		Object d3= d1.clone();
		System.out.println("Cloned date3: "+d3.toString());
		System.out.println("");
		boolean b= d2.before(d1);
		System.out.println("Is date2 is before date1: "+b);
		Date da1= new Date(97, 10, 27);
		Date da2= new Date(97, 6, 12);
		int comparison= da1.compareTo(da2);
		int comparison2= da2.compareTo(da1);
		int comparison3= da1.compareTo(da1);
		System.out.println("d1 > d2 : "+comparison);
		System.out.println("d1 < d2 : "+comparison2);
		System.out.println("d1 = d1 : "+comparison3);
		System.out.println("");
		boolean r1= da1.equals(d2);
		System.out.println("Result of equal() r1: "+r1);
		boolean r2= da1.equals(da1);
		System.out.println("Result of equal() r2: "+r2);
		System.out.println("");
		long c1= da1.getTime();
		long c2= da1.getTime();
		System.out.println("Milliseconds of date1: "+c1);
		System.out.println("Milliseconds of date2: "+c2);
		}
}