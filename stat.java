package corejava;
public class stat
{
	static int count=0;
	stat()
	{
		count++;
		System.out.println(count);
	}
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		stat c1= new stat();
		stat c2= new stat();
		stat c3= new stat();
	}
}