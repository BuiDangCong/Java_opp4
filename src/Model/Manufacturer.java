package Model;

public class Manufacturer {
    private String name_manufacturer;
    private Nation nation;

    public Manufacturer(String name_manufacturer, Nation nation) {
        this.name_manufacturer = name_manufacturer;
        this.nation = nation;
    }

    public String getName_manufacturer() {
        return name_manufacturer;
    }

    public void setName_manufacturer(String name_manufacturer) {
        this.name_manufacturer = name_manufacturer;
    }

    public Nation getNation() {
        return nation;
    }

    public void setNation(Nation nation) {
        this.nation = nation;
    }
}
