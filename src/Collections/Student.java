package Collections;

import java.util.Objects;

public class Student {
    public  int id;
    public String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object c){
        if(this == c) return true;
        if(c == null || getClass() != c.getClass()) return false;
        Student student = (Student) c;
        return id == student.id;
    }
    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

}
