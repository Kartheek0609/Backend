package Facad;

public class Facade {
    private Inventory inv;
    private Address address;
    private ShippingDetails shippingDetails;

    public Facade() {
        this.inv = new Inventory();
        this.address = new Address();
        this.shippingDetails = new ShippingDetails();
    }
    public void orderTracker(){
        inv.inventoryDetails();
        address.updateAddress();
        shippingDetails.shippingUpdate();
    }

}
