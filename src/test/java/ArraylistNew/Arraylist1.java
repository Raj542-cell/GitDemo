package ArraylistNew;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Arraylist1 {
    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        a.add("Raj");
        a.add("selenium");
        a.add("Learning");

//        System.out.println(a.get(2));

        for ( int i=0; i<a.size(); i++)
        {
            System.out.println(a.get(i));
        }

//        for ( String val:a)
//        {
//            System.out.println(val);
//        }
        System.out.println(a.contains("Raj"));
        String[] name = {"Raj", "selenium", "Learning"};
        List<String> nameArraylist = Arrays.asList(name);
        nameArraylist.contains("Raj");


    }
}
