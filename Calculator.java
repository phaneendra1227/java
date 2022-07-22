class Calculator 
{
  	void add(int x,int y)
      {
		System.out.println(x+y);
	}
	void sub(int x,int y)
	{
		System.out.println(x-y);
	}
	void mul(int x,int y)
	{
		System.out.println(x*y);
	}
	void div(int x,int y)
	{
		System.out.println(x/y);
	}
	public static void main(String args[])
      {
       	Calculator sc=new Calculator();
            sc.add(10,20);
		sc.sub(20,10);
		sc.mul(10,20);
		sc.div(20,10);
	}
}