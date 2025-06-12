
import java.util.*;

class Generic {
    public static void main(String args[]){
        // Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        // list.add(34);
        list.add("String");
        // list.add(3.42);
        // Object a=list.get(1); //.get function return object not a data
        // String a= (String)list.get(0);// runtime error Integer cannot be cast to class Sting.
        String a=list.get(0);
        System.out.println(a);

    }}
