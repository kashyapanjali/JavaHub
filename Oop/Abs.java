public class Abs {
     public static void main(String args[]){
        Cat mew=new Cat();
        mew.walk();
        mew.eat();
     }
    
}
abstract class Animal{
    String name;
    void eat(){
        System.out.println("Animal eat");
    }
    abstract void walk();
}
class Dog extends Animal{
    void walk(){
        System.out.println("walk on 2 legs");
    }
}
class Cat extends Animal{
    void walk(){
        System.err.println("walk on 4 legs");
    }
}
