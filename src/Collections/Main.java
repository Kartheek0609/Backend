package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Student nithin= new Student(1,"Nithin");
        System.out.println(nithin.hashCode());
        Student sai = new Student(1,"Sai");
        System.out.println(sai.hashCode());
        System.out.println(nithin.hashCode()==sai.hashCode());
        System.out.println(nithin.equals(sai));
        HashSet<Student> hs= new HashSet<>();
        hs.add(nithin);
        hs.add(sai);

        System.out.println(hs);

        System.out.println("-----------");
        Count c1 = new Count(10);
        Count c2 = new Count(10);
        System.out.println(c1.equals(c2));
    }
}
