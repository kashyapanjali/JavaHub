public class Normal {
    public static void main(String args[]){
          Pen p=new Pen();
          p.setColor("blue");
          System.out.println(p.color);
          p.color="orange";
          System.out.println(p.color);

          BankAccount acc=new BankAccount();
          acc.Setpassword("abc");
          System.out.println(acc.getPassword());

          acc.username="Anjali";
          System.out.println(acc.username);
          
    }
    
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }

    void setTip(int newtip){
        tip=newtip;
    }

}
class BankAccount{
     public String username;
     private String password;

    public void Setpassword(String pwd){
        password=pwd;
    }
    public String getPassword(){
            return password;
        }
    
}