package Prototype;

import java.awt.event.KeyAdapter;

public class Main {
    public static void main(String[] args) {
        Student studentPrototype = new Student("2023","DEC Beginner","LLD","Kartheek","23-1-2024","TTS","4-4-2024");
        System.out.println("Student Prototype");
        System.out.println(studentPrototype);
        Student studentPrototypeBatchA = new Student("2023", "BatchA", "HLD", "Sandeep", "12-June-23", "MWF", "30-Apr-2024");
        Student studentPrototypeBatchB = new Student("2023", "BatchB", "LLD", "naman", "12-Dec-23", "TTS", "30-June-2024");
        Student studentPrototypeBatchC = new Student("2024", "BatchC", "DSA", "mohit", "12-Jan-24", "MWF Morning", "30-Dec-2024");
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.add(studentPrototypeBatchA);
        studentRegistry.add(studentPrototypeBatchB);
        studentRegistry.add(studentPrototypeBatchC);
        studentRegistry.add(studentPrototype);
        Student kunal = studentRegistry.get("BatchB").clone();
        System.out.println(kunal);
        kunal.setName("Kunal");
        kunal.setEmail("k@email.com");
        kunal.setPhoneNumber("123456");
        System.out.println(kunal);
        Student kartheek = studentRegistry.get("DEC Beginner").clone();
        kartheek.setName("Kartheek");
        kartheek.setEmail("k2@gmail.com");
        kartheek.setPhoneNumber("1234456");
        System.out.println(kartheek);
    }
}
