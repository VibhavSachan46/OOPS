package properties.inheritance;

public class Box {

    double l;
    double h;
    double w;

    Box() {
        super(); //object class
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double l, double w, double h) {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }

    Box (Box old){
        this.l = old.l;
        this.w = old.w;
        this.h = old.h;
    }
}
