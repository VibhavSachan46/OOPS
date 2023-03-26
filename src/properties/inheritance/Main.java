package properties.inheritance;

public class Main {
    public static void main(String[] args) {


        Box box1 = new Box(5.2);
        System.out.println(box1.l +" " + box1.w + " " + box1.h);

        Box box = new Box(box1);
        System.out.println(box.l +" " + box.w + " " + box.h);
    }
}
