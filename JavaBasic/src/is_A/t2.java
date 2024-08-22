package inheritance;

public class animal {
    animal() {
        System.out.println("Animal class");
    }

    public class Dog extends animal {
        void bark() {
            System.out.println("Barking");
        }
    }

    public static void main(String[] args) {
        Dog d = new animal().new Dog();
        d.bark();
    }
}
