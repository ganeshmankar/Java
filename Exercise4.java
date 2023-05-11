
class Library{
    public void addBook(){
        System.out.println("Adding book...");
    }
    public void issueBook(){
        System.out.println("Issuing book...");
    }
    public void  returnBook(){
        System.out.println("Returning the book...");
    }
    public void showAvailableBook(){
        System.out.println("Showing available books...");
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Library harry = new Library();
        harry.addBook();
        harry.issueBook();
        harry.returnBook();
        harry.showAvailableBook();
    }
}
