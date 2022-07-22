import java.util.Scanner;
class QuadraticEquation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the a value: ");
        int a = obj.nextInt();
        System.out.print("Enter the b value: ");
        int b = obj.nextInt();
        System.out.print("Enter the c value: ");
        int c = obj.nextInt();
	  double d = (b*b)-(4*a*c);
	  if(d<0)
	  {
	   	System.out.println("The roots are imaginary");
	  }
	  else if(d==0) {
		
       	System.out.println("Roots are Equal");
		double r1=(-b)/(2*a);
		System.out.println("Root : " + r1);
	  }
	  else {
 		double r2=((-b)+(Math.sqrt(d)))/(2*a);
		double r3=((-b)+(Math.sqrt(d)))/(2*a);
		System.out.println("Roots are real");
		System.out.println("Root1: " + r2);
		System.out.println("Root2: " + r3);
	  }
   }
}