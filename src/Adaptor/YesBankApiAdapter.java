package Adaptor;

public class YesBankApiAdapter implements BankApiAdapter{
    private YesBankApi yesBankApi = new YesBankApi();
    @Override
    public double checkBalance(User user) {
        long balance = yesBankApi.getBalance(user.getUserName(),user.getPassWord());
        return (double)balance;
    }

    @Override
    public int doTranscation(User fromUser, User toUser, double amount) {
        char result = yesBankApi.doTransaction(fromUser.getUserName(), toUser.getUserName(), fromUser.getPassWord(), amount);
        if(result =='Y'){
            return 1;
        }else{
            return 0;
        }
    }
    public boolean changePin(User user, int currentPin, int newPin) {
        return yesBankApi.changePin(user.getUserName(), user.getPassWord(), currentPin, newPin);
    }
}
