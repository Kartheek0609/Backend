package Constructor;

public class Student {
    public int id;
    public String name;
    public int totalMarks;
    // Constructor Overloading
    public Student(){

    }

    public Student(int id, String name, int totalMarks) {
        this.id = id;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
