
class MyEmployee{
    private int id;  //Since we use private we have to do this
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class AccessModifiers {
    public static void main(String[] args) {
        MyEmployee lucifer = new MyEmployee();
        // harry.id = 45;
        // harry.name = "CodeWithHarry"; --> Throws an error due to private access modifier
        lucifer.setName("Ganesh Mankar");
        System.out.println("Name: " + lucifer.getName());
        lucifer.setId(212006);
        System.out.println("Id: " + lucifer.getId());
    }
}
