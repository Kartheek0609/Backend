package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Menu.Menu;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.MAC);
        UIFactory factory = flutter.createUIFactory();
        Menu menu= factory.createMenu();
        Button button = factory.createButton();
        Dropdown dropdown= factory.createDropDown();
        flutter.setTheme();
        flutter.createUIFactory();
    }
}
