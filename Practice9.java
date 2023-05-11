
class Circle{
    Circle(){      //It is a default constructor
        System.out.println("I am non param of circle");
    }
    public int radius;
    Circle(int r){
        this.radius = r;
        System.out.println("I am circle parameterised constructor !");
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);   //Try commenting it
        System.out.println("I am cylinder1 parameterised constructor ! ");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class Practice9 {
    public static void main(String[] args) {

        //Problem 01
//        Circle objc = new Circle(12);
        Cylinder1 obj = new Cylinder1(4, 5);
//        System.out.println("The volume is " + obj.volume());

    }
}
