package JavaM;
public class a 
{
	static int last_roll = 100;
	int roll_no;
	a()
	{
		roll_no= last_roll;
		last_roll++;
	}
	public int hashCode()

	{
		return roll_no;
	}
	public static void main(String args[])
	{
		a S= new a();
		System.out.println(S);
		System.out.println(S.toString());
		Object O= new String("FACE");
		@SuppressWarnings("rawtypes")
		Class b= O.getClass();
		System.out.println("Class of object is: "+b.getName());
		S=null;
		System.gc();//garbage collection
	}
	protected void finalize()
	{
		System.out.println("finalize method called");
	}
}