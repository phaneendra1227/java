class MethodOverload {
    void mul(int x) {
        System.out.println(x*x);
    }
    void mul(int x,int y) {
        System.out.println(x*y);
    }
    public static void main(String[] args) {
        MethodOverload s=new MethodOverload();
        s.mul(12);
        s.mul(10,20); 
    }

}