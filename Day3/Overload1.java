
class practice {
    void show(int a) {
        System.out.println("INTEGER:" + a);
    }

    void show(String s) {
        System.out.println("String" + s);
    }

    void show(double d, String s) {
        System.out.println("Double:" + d + "and " + "String:" + s);
    }
}

public class Overload1 {
    public static void main(String args[]) {
        practice p = new practice();
        p.show(10);
        p.show("Adarsh");
        p.show(99.9, "Mishra");
    }
}