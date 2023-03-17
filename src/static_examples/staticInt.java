package static_examples;

// this is demo to show initializtion of static variable.
// as soon as this class is loaded all static elements run first.
public class staticInt {
    static int a=4; //1st
    static int b;

    //will run only once when the first object is cereated
    // i.e. when the class is loaded for 1st time.
    static { //2nd
        System.out.println("Static block");
        b = a+5; //3rd
    }

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
