package practice;

public class Person {
    int age = 30;
    String colour = "White";
    String name = "Umar";

    public void eat() {
        System.out.println("Eating food");
    }

    public void sleep() {
        System.out.println("Person is sleeping");
    }

    class Employee extends Person {
        public void eat() {
            System.out.println("Eating biryani");
        }

        public Employee() {
            age = 25;
            colour = "brown";
            name = "Farooq"; 
            System.out.println("Employee details: Age=" + age + ", Colour=" + colour + ", Name=" + name);
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
      
        p.eat();
        
        Employee e = p.new Employee(); 
        e.eat(); 
    }
}
