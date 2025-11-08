class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        System.out.println("Default Constructor called");
        name = "Adarsh";
        age = 21;
    }

    // Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(); // Default constructor
        s1.display();

        Student s2 = new Student("Adarsh Mishra", 22); // Parameterized constructor
        s2.display();
    }
}
