
interface Bicycle{
    int a = 45;  //Properties made in Interfaces are final
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    int a = 45;  //Properties made in Interfaces are final
    void blowHornKgf();
    void blowHornAbc();
}

class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("peee peeeeeee...");
    }
    public void applyBreak(int decrement){    //for methods in interface we have to make it public
        System.out.println("Applying break...");
    }
    public  void speedUp(int increment){
        System.out.println("Applying speedup... ");
    }
    public void blowHornKgf(){
        System.out.println("KGF movie is lit peepeepepe");
    }
    public void blowHornAbc(){
        System.out.println("There is no any movie poopoopopo");
    }
}

public class interfaces {
    public static void main(String[] args) {
        AvonCycle cy = new AvonCycle();
        cy.applyBreak(5);
        //You can create properties in Interface
        System.out.println(cy.a);
        //You cannot modify the properties in Interfaces as they are final
        cy.blowHornAbc();
        cy.blowHornKgf();
    }
}
