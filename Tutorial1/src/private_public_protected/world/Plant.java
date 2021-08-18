package private_public_protected.world;

class Something {

}

public class Plant {
    //Bad practice
    public String name;

    //Acceptable practice --It's final
    public final static int ID = 8;

    private String type;

    protected String size;

    int height;

    public Plant() {

       this.name = "Freddy";
        this.type = "plant";
        this.size = "large";
        this.height = 7;
    }
}
