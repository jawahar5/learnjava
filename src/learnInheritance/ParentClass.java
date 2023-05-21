package learnInheritance;

public class ParentClass {
    // any variable declared as final is like a const declaration in JS. can't change it
     final int  sampleVariable = 5;

     public int ParentConstructor(int i, int j){
         System.out.println("I am just a simple parametrized constructor with two integers. first one is "+i+ " and second number is  "+j);
         return i+j;
     }

     private void displayPrivateFn(){
         System.out.println("I am a simple function with private access specifier");
     }
     protected void displayProtectedFn(){
         System.out.println("I am a simple function to display protected function");
     }
}
