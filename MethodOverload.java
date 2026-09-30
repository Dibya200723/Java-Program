public class MethodOverload {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        System.out.println("Sum of two integers: " + obj.add(5, 10));
        System.out.println("Sum of three integers: " + obj.add(5, 10, 15));
        System.out.println("Sum of two doubles: " + obj.add(5.7, 10.5));
    }
}
