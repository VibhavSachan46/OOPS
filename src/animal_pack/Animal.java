package animal_pack;

public class Animal
{
    public void eat()
    {
        System.out.println("EAT method");
    }
    public void sleep()
    {
        System.out.println("Sleep method");
    }
}

class Bird extends Animal{
    @Override
    public void eat() {
        super.eat();
        System.out.println("override eat");
    }
    @Override
    public void sleep() {
        super.sleep();
        System.out.println("override sleep");
    }

    public void fly()
    {
        System.out.println("in fly method");

    }
}

class Animals{
    public static void main(String[] args) {
        Animal a =new Animal();
        Bird b = new Bird();
        a.eat();
        a.sleep();
        b.eat();
        b.sleep();
        b.fly();
    }
}
