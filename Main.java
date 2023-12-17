public class Main {
   public static void main(String []args){
      
      Pet cat = new Pet();
      petLeftAlone(cat);
      System.out.println("Happiness of the cat is " + cat.happiness + "%");
      cat.leftAlone(); 
      cat.leftAlone(); 
      cat.leftAlone();
      cat.houseLook(); 
      System.out.println("The house is " + cat.houseLevel + "% destroyed");
        
   }   
   /* */
   private static void petLeftAlone(Pet pet) {
        pet.leftAlone();
        pet.hunger();
        System.out.println("I am alone and hungry");
        
   }*/
}