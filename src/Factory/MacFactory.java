package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Button.MacButton;
import Factory.Components.Dropdown.Dropdown;
import Factory.Components.Dropdown.MacDropdown;
import Factory.Components.Menu.MacMenu;
import Factory.Components.Menu.Menu;

public class MacFactory implements UIFactory{
    @Override
    public Dropdown createDropDown() {
        return new MacDropdown();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() { return new MacMenu(); }
}
