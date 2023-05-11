
abstract class Parent2{
    public Parent2(){
        System.out.println("I am constructor of Parent2");
    }
    public void sayHello(){
        System.out.println("HELLO !");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning !");
    }
    @Override
    public void greet2(){
        System.out.println("Good Afternoon !");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class abstract_class {
    public static void main(String[] args) {
//        Parent2 p = new Parent2();    // We cant make object coz parent2 and child3 is an abstract class
//        Child3 ch = new Child3();
        Child2 c = new Child2();

    }
}


/*
abstract class Phone{
  abstract void on();
}
class SmartPhone extends Phone{
void run(){
System.out.println("Turning on...");
}
public static void main(String args[]){
 Phone obj = new SmartPhone();
 obj.on();
}
}
*/