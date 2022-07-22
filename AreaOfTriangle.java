import java.util.Scanner;
class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the a value: ");
        int a = obj.nextInt();
        System.out.print("Enter the b value: ");
        int b = obj.nextInt();
        System.out.print("Enter the c value: ");
        int c = obj.nextInt();
        if(a+b>c && a+c>b && b+c>a) {
        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print("The Area of triangle is : " + area);
        }
    }
}