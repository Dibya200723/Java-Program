 class parent {
    void print() {
        System.out.println("Parent class");
    }
    
}
class subclass1 extends parent {
    void print() {
        System.out.println("Subclass 1");
    }
}
class subclass2 extends parent {
    void print() {
        System.out.println("Subclass 2");
    }
}
public class TestPolymorphism {
    public static void main(String[] args) {
        parent a;
        a = new subclass1();
        a.print();
        a = new subclass2();
        a.print();
    }
}
