package Adaptor;

public interface BankApiAdapter {
    double checkBalance(User user);
    int  doTranscation(User fromUser,User toUser, double amount);
    boolean changePin(User user, int currentPin, int newPin);
}
