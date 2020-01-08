package JavaUtilDateExample;
import java.sql.Date;
public class JUDex1 
{
	public static void main(String args[])
	{
		long m= System.currentTimeMillis();
		java.sql.Date d1=new java.sql.Date(m);
		System.out.println(d1); // Today's Date
		String s="2015-03-31";
		Date d2= Date.valueOf(s);
		System.out.println(d2); // Print the value of d2
	}
}