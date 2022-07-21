class A
{
	void print()
	{
		System.out.println("I am in class A");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("I am in class B");
	}
}
class C extends B
{
	void show()
	{
		System.out.println("I am in class C");
	}
}
class D extends A
{
	void print()
	{
		System.out.println("I am in class D");
	}
}
class InheritanceDemo
{
	public static void main(String args[])
	{
		D obj = new D();
		C sc = new C();
		A r=new A();
		obj.print();
		sc.show();
		r.print();
	}
}