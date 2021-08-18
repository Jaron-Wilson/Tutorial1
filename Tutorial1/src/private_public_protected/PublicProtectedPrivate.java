package private_public_protected;

import private_public_protected.world.Plant;

/*
* private --- only within same class
* public -- from anywhere
* protected --- same class, subclass, and same package
* no modifier -- same package only
*/

public class PublicProtectedPrivate {
    
    public static void main(String[] args) {

        Plant plant = new Plant();

        System.out.println(plant.name);
        System.out.println(plant.ID);
//        wont work type is private
//        System.out.println(plant.type);

//        size is protected; This class is not in the same package as Plant.
//        wont work
//        System.out.println(plant.size);

//        wont work; this class and Plant are in different packages, height has package-level visibility.
//        System.out.println(plant.height);

    }
}
