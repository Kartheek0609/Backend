package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Button.IOSButton;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Dropdown.IOSDropdown;
import Factory.Components.Menu.IOSMenu;
import Factory.Components.Menu.Menu;

public class IOSFactory implements UIFactory{
    @Override
    public Dropdown createDropDown() {
        return new IOSDropdown();
    }

    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }
}
