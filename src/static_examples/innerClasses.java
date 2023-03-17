package static_examples;

class Test{
    static String name;

    public Test(String name){
        Test.name = name;
    }

    public void display(){
        System.out.println(this.name);
    }
}

public class innerClasses {

    public static void main(String[] args) {
        Test a = new Test("Vibhav");
        Test b = new Test("Abhi");

        a.display();
        b.display();
    }
}