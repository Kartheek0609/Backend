package singleton;

public class Singletonadvance {
    private static Singletonadvance instance;

    public Singletonadvance() {
    }

    public static Singletonadvance getIntsance() {
        if(instance == null){
            synchronized (Singletonadvance.class){
                if(instance == null) instance = new Singletonadvance();
            }
        }
        return instance;
    }
}
