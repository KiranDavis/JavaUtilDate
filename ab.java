package corejava;
public class ab 
{
	private int n=10;

	class inner
	{
		void a()
		{
			System.out.println(n);
		}
	}
	public static void main(String args[])
	{
		ab c= new ab();
		ab.inner d= c.new inner();
		d.a();
	}
}