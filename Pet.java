public class Pet {

   int happiness;
   int sadness;
   int anger;
   int emotionmeter;
   String feeling;
   int houseLevel;
   
   Pet(){
      happiness = 0;
      sadness = 0;
      anger = 0;
      emotionmeter = 100;
      houseLevel = 100;
      //updateFeeling();
   }
   
   void goodboy(){
      System.out.println("Good boy!");
      this.happiness += 10;
      System.out.println("Happiness now is " + this.happiness+ "%");
   }
   void petting(){
      this.happiness += 5;
      System.out.println("Happiness now is " + this.happiness+ "%");
   }
   void hunger(){
      this.sadness += 5;
      System.out.println("Sadness now is " + this.sadness+ "%");
   }
   
   void leftAlone(){
      this.anger += 15;
      System.out.println("Anger now is " + this.anger+ "%");
   }
   
   void houseLook() {
    if (this.anger >= 50) {
        houseLevel -= 30;
    } else if (this.anger > 0 && this.anger <= 50) {
        houseLevel -= 50;
    } else {
        // If anger is exactly 0
        houseLevel = 100;
    }
}
}