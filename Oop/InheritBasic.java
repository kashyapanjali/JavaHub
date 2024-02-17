public class InheritBasic {
    public static void main(String args[]){
        Fish shark=new Fish();
        shark.eat();
  
        Dog dobby=new Dog();
        dobby.eat();
        dobby.color="red";
        System.out.println(dobby.color);
        Cat mew=new Cat();
        mew.color="red";
        System.out.println(mew.color);
      }      
  }
  
  //base class/parent class
  class Animal{
      String name;
  
      void eat(){
          System.out.println("eats");
      }
      void breath(){
          System.out.println("breaths");
      }
  }
  
  class Mammel extends Animal{
      String color;
  
  }
  //multilevel
  class Dog extends Mammel{
      int legs;
  }
  class Cat extends Mammel{
      String sound;
  }
  //single level
  //Derived class/child class/ subclass
  class Fish extends Dog{
      int fins;
  
      void swim(){
          System.out.println("Swims");
      }
  
      void color(){
          System.out.println("colors");
      }
    
}
