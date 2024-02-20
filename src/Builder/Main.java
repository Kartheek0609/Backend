package Builder;

public class Main {
    public static void main(String[] args) {
        Student s=  Student.builder()
                .id(1)
                .name("Kartheek")
                .GradYear(2021)
                .age(19)
                .psp(100)
                .phoneNumber("9100336772")
                .build();
        System.out.println(s);
    }
}
