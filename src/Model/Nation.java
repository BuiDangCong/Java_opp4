package Model;

public class Nation {
    private int id_Nation;
    private String name_Nation;

    public Nation(int id_Nation, String name_Nation) {
        this.id_Nation = id_Nation;
        this.name_Nation = name_Nation;
    }

    public int getId_Nation() {
        return id_Nation;
    }

    public void setId_Nation(int id_Nation) {
        this.id_Nation = id_Nation;
    }

    public String getName_Nation() {
        return name_Nation;
    }

    public void setName_Nation(String name_Nation) {
        this.name_Nation = name_Nation;
    }
}
