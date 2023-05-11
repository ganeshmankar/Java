import java.security.spec.EllipticCurve;

class Ekclass{
    int a;
    public int getA(){
        return a;
    }
    Ekclass(int a){
        //a = a;  //This will give error
        this.a = a;   //Use this. to refer
    }
    public int returnone(){
        return 1;
    }
}

class thisClass extends Ekclass{
    thisClass(int c){
        super(c);
        System.out.println("I am constructor !");
    }
}


public class this_and_super {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(21);
        System.out.println(e.getA());
        thisClass t = new thisClass(5);
    }
}
