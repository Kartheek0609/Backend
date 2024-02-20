package Adaptor;

public class YesBankApi {
    public long getBalance(String userName, String passWord){
        return 1000;
    }
    public char doTransaction(String fromUser, String toUser,String fromUserPassword, double amount){
        return 'Y';
    }
    public boolean changePin(String userName,String password, int currentPin,int newPin){
        return true;
    }

}
