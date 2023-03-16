package com.vibhav.intro;

import java.util.ArrayList;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        final Student vibhav = new Student(10,"Vibhav",10.0f);
//        Student random = new Student(vibhav);
//        Student random2 = new Student();

//        System.out.println(random2.name);

        vibhav.greeting();
//        vibhav.changeName("Sachan");
//        vibhav.greeting();


//        System.out.println(vibhav.rno);
//        System.out.println(vibhav.name);
//        System.out.println(vibhav.marks);
//
//        System.out.println(random.rno);
//        System.out.println(random.name);
//        System.out.println(random.marks);

//        Student one = new Student();
//        Student two = one;
//        two.name = "something";
//
//        System.out.println(one.name);
//        System.out.println(two.name);


    }


}
//create packages.a class
class Student{
    int rno;
    String name;
    float marks ;

    // we need away to add values of
    // the above properties object by object


    //we need 1 word to aaccess every objejct = this keyword

    void greeting()
    {
        System.out.println("Hello! my name is "+ name);
    }

    void changeName(String newName)
    {
        this.name = newName;
    }

    Student()
    {

        // this is how we call packages.a constructor from another const.
        // internally: new student(13,"Default",100.0f);
        this(13,"Default",100.0f);
    }

     Student(Student other)
    {
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    Student(int rno ,String name ,float marks)
    {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
// constructor is packages.a function that runs when we-
// -create packages.a object and it allocates some varaibels