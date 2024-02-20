package singleton;

public class Main {
    public static void main(String[] args) {

        DBConn d1 = new DBConn();
        d1.connect();
        d1.connect();
        d1.connect();
        d1.connect();
        d1.connect();
        d1.connect();
        d1.connect();
        d1.connect();
        System.out.println(d1.connect());
        System.out.println(d1.noOfConn);
        d1.connect();
        System.out.println(d1.connect());
        d1.connect();
        d1.connect();
        System.out.println(d1.connect());
        System.out.println(d1.noOfConn);

    }
}
