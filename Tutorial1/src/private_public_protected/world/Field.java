package private_public_protected.world;

public class Field {
   private Plant plant = new Plant();

   public Field() {
//       size is protected; and Field is in the same package as Plant.
       System.out.println(plant.size);
   }
}
