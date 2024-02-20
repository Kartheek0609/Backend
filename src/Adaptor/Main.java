package Adaptor;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kartheek","12345678");
        ICICIBankApiAdapter customer = new ICICIBankApiAdapter();
        System.out.println(customer.checkBalance(user));
        Phonepe p= new Phonepe();
        p.checkBalance(user);
        p.transferMoney(user,user,10);
    }
}
