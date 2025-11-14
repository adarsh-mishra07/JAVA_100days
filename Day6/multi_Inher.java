
public class multi_Inher {
    public static void main(String args[]) {
        Manager m = new Manager();
        m.showManager();
        m.showPerson();
        m.ShowEmployee();
    }
}

class Person {

    void showPerson() {
        System.out.println("I am Person");
    }
}

class Employee extends Person {
    void ShowEmployee() {
        System.out.println("I am Employee");
    }
}

class Manager extends Employee {

    void showManager() {
        System.out.println("I am manager");
    }
}
