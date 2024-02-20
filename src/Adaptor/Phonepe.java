package Adaptor;

public class Phonepe {
    private BankApiAdapter bankApiAdapter;
    public Phonepe(){
        this.bankApiAdapter= new ICICIBankApiAdapter();
    }
    public void checkBalance(User user){
        double d= bankApiAdapter.checkBalance(user);
        System.out.println("Balance +" + d);
    }
    public void transferMoney(User fromUser, User toUser, double amount){
        if(bankApiAdapter.checkBalance(fromUser) < amount){
            System.out.println("Transaction was failed due to insufficient funds");
        }
        int status = bankApiAdapter.doTranscation(fromUser, toUser, amount);
        switch(status){
            case 1 :
                System.out.println("Successfull");
                break;
            case 0 :
                System.out.println("Failed");
                break;
            default :
                System.out.println("In Progress");
                break;
        }
    }


}
