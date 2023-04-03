package properties.inheritance;

public class Main {
    public static void main(String[] args) {


//        Box box1 = new Box(5.2);
//        System.out.println(box1.l +" " + box1.w + " " + box1.h);
//
//        Box box = new Box(box1);
//        System.out.println(box.l +" " + box.w + " " + box.h);
//
//        Boxweight box3 = new Boxweight();
//        System.out.println(box3.weight +" "+ box3.l +" " + box3.w + " " + box3.h);


        //here type of object(Boxweight) will not determine what members will be access
        // but type of refernece will determine
//        Box box5 = new Boxweight(2,3,4,8);
//        System.out.println(box.w);
//        when a reference to a subclass object is assigned to super class
//        variable only super class object will have access


//        Boxweight box6 = new Box(2,3,4,8);
        //Box class has no idea what weight is.
        //below classes knows what classes are above. But above classes dont know what classes are below.

    }
}
