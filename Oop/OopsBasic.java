public class OopsBasic {
    
    public static void main(String args[]){
        Pen p1=new Pen();  //copy constructor //object created as a p1
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
        p1.setcolor("orange");
        System.out.println(p1.getcolor());
        /*p1.setcolor("blue");
        System.out.println(p1.color);
        p1.settip(5);
        System.out.println(p1.tip);

        p1.color="orange";
        System.out.println(p1.color);
        p1.tip=5;
        System.out.println(p1.tip);*/



      //   Bankaccount myacc=new Bankaccount();
      //   myacc.username="Anjali Kashyap";
      //   System.out.println(myacc.username);
      //   myacc.setpassword("abcdef");
      //   System.out.println(myacc.getPassword());
      
      }
  
}
// class Bankaccount{
//     public String username;
//     //cannnot access outside
//     private String password;
//     //so to the use of the outside

//     public void setpassword(String newpass){
//         password=newpass;
//     }
//     public String getPassword() {
//         return password;
//     }
// }




// class Pen{
//     //Attribute that means properties
//     String color;
//     int tip;

//     //Function that means behavior
//     void setcolor(String newcolor){
//         color=newcolor;
//     }

//     void settip(int newtip){
//         tip=newtip;
//     }
// }



class Pen{
  private String color;
  private int tip;

   //use of getter keyword that means return the value
  String getcolor(){
      return this.color;
  }

  int gettip(){
      return this.tip;
  }


  //use the setter function that means modify the function
  public void setcolor(String newcolor){
      this.color=newcolor;
  }
  public void settip(int newtip){
      this.tip=newtip;
  }
    
}
