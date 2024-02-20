package Adaptor;

public class ICICIBankApiAdapter implements BankApiAdapter{
    private ICICIBankApi iciciBankApi= new ICICIBankApi();

    @Override
    public double checkBalance(User user) {
        return iciciBankApi.checkBalance(generateUserToken(user));
    }

    @Override
    public int doTranscation(User fromUser, User toUser, double amount) {
        return iciciBankApi.transferMoney(generateUserToken(fromUser),generateUserToken(toUser),amount);
    }

    @Override
    public boolean changePin(User user, int currentPin, int newPin) {
        return iciciBankApi.changePin(generateUserToken(user),newPin,currentPin);
    }

    private String generateUserToken(User user) {
        return user.getUserName() + user.getPassWord();
    }
}
