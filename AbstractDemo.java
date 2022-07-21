abstract class AbstractEx
{
	abstract void show();
}
class AbstractDemo
{
	void show()
	{
		System.out.println("I am in show method");
	}
	public static void main(String args[])
	{
		AbstractDemo a=new AbstractDemo();
		a.show();
	}
}
