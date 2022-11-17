package entities;

public class Pokemon {

    private String name;
    private  String descrip;
    private int image;

    public Pokemon(String name, String descrip, int image){
        this.name = name;
        this.descrip = descrip;
        this.image = image;

    }
    public String getName() {
        return this.name;
    }

    public String getDescrip() {
        return this.descrip;
    }

    public int getImage() {
        return this.image;
    }
}
