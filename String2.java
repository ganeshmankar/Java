import java.util.Locale;

public class String2 {
    public static void main(String[] args) {
        String name = "Ganesh";
        System.out.println(name);

        int len = name.length();
        System.out.println(len);

//        name = name.toLowerCase();   //It will convert otherwise it will create a new string
        String lcase = name.toLowerCase();
        System.out.println(lcase);

        String ucase = name.toUpperCase();
        System.out.println(ucase);

        String nonTrimmedString = "    Ganesh    ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());    //It will give us TrimmedString

        System.out.println(name.substring(3));  //index 3 to end
        System.out.println(name.substring(1,5));  //It wont include 5

        System.out.println(name.replace('G', 'D'));
        System.out.println(name.replace("Gan", "Mang"));
        System.out.println(name.replace("e", "ve"));

        System.out.println(name.startsWith("Gan"));
        System.out.println(name.endsWith("esh"));

        System.out.println(name.charAt(0));
//        System.out.println(name.charAt(1));
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(3));
//        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(5));

        System.out.println(name.indexOf("esh"));
//        System.out.println(name.indexOf("s"));

        String name1 = "Harryrry";
        System.out.println(name1.indexOf("rry", 4));
        System.out.println(name1.lastIndexOf("rry"));  //If we write any meaningless words it will return -1
        System.out.println(name1.lastIndexOf("rry", 4));

        System.out.println(name.equals("Ganesh"));
        System.out.println(name.equals("ganesh"));

        System.out.println(name.equalsIgnoreCase("gAnesH"));

        System.out.println("\"I am Ganesh\" \n \\ \t Hello!");

    }

}
