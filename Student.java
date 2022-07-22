class ConstructorOverload {
    ConstructorOverload(int x) {
        System.out.print(x);
    }
    ConstructorOverload(String name) {
        System.out.print(name);
    }
    public static void main(String[] args) {
        ConstructorOverload obj=new ConstructorOverload(x);
        ConstructorOverload obj=new ConstructorOverload(name);


    }
}