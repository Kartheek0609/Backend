package Adaptor;

public class ICICIBankApi {
    public double checkBalance(String userToken){
        return 1000;
    }
    public int transferMoney(String fromUserToken, String toUserToken,double amount){
        return 1;
    }
    public boolean changePin(String userToken,int newPin,int currentPin){
        return true;
    }

}
