package InheritenceAndPolymorphism;

public class Main {
    public static void main(String[] args) {
        Instructor i = new Instructor("Kartheek",
                "kartheekreddy6@gmail.com","123");

        User u= new User("Kartheek@2","132","1213");
        System.out.println(i.name+" "+i.password+" "+i.email);
        System.out.println(u.name+" "+u.password+" "+u.email);
    }
}
