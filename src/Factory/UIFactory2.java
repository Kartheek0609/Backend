package Factory;

public class UIFactory2 {
    public static UIFactory getUIFactory(SupportedPlatforms supportedPlatforms){
        switch(supportedPlatforms){
            case IOS : return  new IOSFactory();
            case ANDROID: return new AndroidFactory();
            case MAC : return new MacFactory();
        }
        return null;
    }

}
