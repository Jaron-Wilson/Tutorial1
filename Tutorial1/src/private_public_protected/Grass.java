package private_public_protected;

import private_public_protected.world.Plant;

public class Grass extends Plant {
    public Grass() {

//        wont work --- Grass not in same package as Plant even though its a subclass.
//        System.out.println(this.height);
    }
}
