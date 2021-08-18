package private_public_protected.world;

public class Oak extends Plant{

    public Oak() {

//        wont work type is private
//    type = "treeeeee";

        //this works because size is protected and Oak is a subclass of Plant.
        this.size = "small";

//        no access specifier; works because Oak and Plant are in the same package.
        this.height = 10;
    }
}
