package static_examples;

public class Main
{
    public static void main(String[] args) {
//        Human vibhav = new Human(20,"Vibhav" ,1000, false);
//        Human Rahul = new Human(22,"Rahul" ,1500, true);
//        Human rajat = new Human(22,"Rahul" ,1500, true);
//
//        System.out.println(vibhav.name);
//        System.out.println(Human.population);

//        greeting();
        fun();
    }

    static void fun(){
        System.out.println("static function");
        //greeting(); cannot use this as it requires an instance,
        //but the functoin you are using it in does not depend on instance.


        // we cannot accesss non static stuff without referring
        // their instance in  a static context.

        //here iam referencing it.
        Main obj = new Main();
        obj.greeting();
    }


    //this belongs to some instance
    void greeting(){

        System.out.println("Non static");
        greet();
    }

    void greet(){
        System.out.println("Another");
    }

    //this is not dependent on objects coz it is static.
    // It does not belong to instance





}
