
class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting X now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("Its me constructor !");
    }
}

class Derived extends Base {
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class inheritance {
    public static void main(String[] args) {

        //Creating an object of Base class
//        Base b = new Base();
//        b.setX(4);
//        System.out.println(b.getX());

        //Creating an object of derived class
        Derived d = new Derived();
        d.setX(4);
        System.out.println(d.getX());
        d.setY(9);
        System.out.println(d.getY());

    }
}
