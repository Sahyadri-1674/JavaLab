import java.util.Locale;

public class Strings1 {
    public static void main(String[] args) {
        String name = "Prasad";
        String name1 = "Harryrry";
        String city = new String("Kalyan");//String is a Class in java but it can be used as a datatype
        int len = name.length();
        System.out.println("Length of the string is "+len);
        String lname = name.toUpperCase();
        System.out.println(lname);
        String uname = name.toLowerCase();
        System.out.println(uname);
        System.out.println(name.startsWith("P"));
        System.out.println(name.endsWith("d"));
        String newcity = city.replace("yan","va");
        System.out.println(newcity);
        System.out.println(city.equalsIgnoreCase("kalyan"));
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("ad"));
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.substring(2));
        System.out.println(city.substring(4));
        System.out.println(name.substring(2,5));
        System.out.println(name1.lastIndexOf("rry"));
        System.out.println(name1.indexOf("rry",5));
        System.out.println(name1.lastIndexOf("rry",4));
    }
}
