
class Phone{
    public void showTime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class Smartphone extends Phone{
    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on Smartphone...");
    }
}

public class dynamic_method_dispatch {
    public static void main(String[] args) {
//        Phone obj =  new Phone();
//        Smartphone smobj = new Smartphone();
//        obj.name();

        Phone obj = new Smartphone();  //Yes its allowed
//        Smartphone obj2 = new Phone();   //Not allowed

        obj.showTime();
        obj.on();
        //obj.music();   //Not Allowed
    }
}
