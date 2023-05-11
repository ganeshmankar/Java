class MyMainEmployee{
    private int id;  //Since we use private we have to do this
    private String name;

    //Method Overloading
    public MyMainEmployee(){
        name = "Your_name_here";
        id = 0000;
    }

    public MyMainEmployee(String myName, int myId){
        name = myName;
        id = myId;
    }

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

public class Constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee("Lucifer", 21);
//        MyMainEmployee harry = new MyMainEmployee();  //Method Overloading
        //harry.setName("Ganesh Mankar");
        //System.out.println("Name: " + harry.getName());
        //harry.setId(212006);
        //System.out.println("Id: " + harry.getId());

        System.out.println("Name: " + harry.getName());
        System.out.println("Id: " + harry.getId());


    }
}
