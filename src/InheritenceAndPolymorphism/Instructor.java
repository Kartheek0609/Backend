package InheritenceAndPolymorphism;

public class Instructor extends  User{
    public Instructor(String name, String email, String password) {
        super(name, email, password);
        System.out.println("Constructor inside Instructor");
    }
}
