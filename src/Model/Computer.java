package Model;

public class Computer {
    private Manufacturer manufacturer;
    private Date_of_manufacture dateOfManufacture;
    private double price;
    private int warranty_period;

    public Computer(Manufacturer manufacturer, Date_of_manufacture dateOfManufacture, double price, int warranty_period) {
        this.manufacturer = manufacturer;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
        this.warranty_period = warranty_period;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date_of_manufacture getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date_of_manufacture dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getWarranty_period() {
        return warranty_period;
    }

    public void setWarranty_period(int warranty_period) {
        this.warranty_period = warranty_period;
    }
    public boolean check_Price(Computer computer){
        return this.price < computer.price;
    }

}
