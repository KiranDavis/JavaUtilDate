package corejava;
abstract class ba
{
	abstract void learn();
}
class anonymousInnerClass
{
	public static void main(String args[])
	{
		ba p= new ba()
				{
			void learn()
			{
				System.out.println("Welcome to DDUGKY FACE Kollam");
			}
			
				};
				p.learn();
	}
}
