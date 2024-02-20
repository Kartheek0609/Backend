package Factory;

import Factory.Components.Button.AndroidButton;
import Factory.Components.Button.Button;
import Factory.Components.Dropdown.AndroidDropdown;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Menu.AndroidMenu;
import Factory.Components.Menu.Menu;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Dropdown createDropDown() {
        return new AndroidDropdown();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
