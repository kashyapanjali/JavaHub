import java.util.*;

public class basic {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);

        // output
        char arr[]={'a','b','c','d'};
        System.out.println(arr);
        System.out.println();

        //Take new String
        String word=new String("abc");
        System.out.println(word);
        System.out.println();
        
        //length of the array
        String name="Anjali kashyap";
        System.out.println(name.length());
        System.out.println(name);
        System.out.println();

        //input
        System.out.println("enter the name of the string");
        String name1=sc.nextLine();

        //output
        System.out.println("Name of string is:"+name1);
        System.out.println();

        //concatenation
        String first_name="Kajal";
        String last_name="Kumari";
        String full_name=first_name+" "+last_name;
        System.out.println(full_name);
        System.out.println(" "+ " ");  //here is the term of concatenation with plus sign(+)

        //find any string character by index
        System.out.println("As your wish you will enter faltuname");
        String faltu_name=sc.nextLine();
        String namereal=faltu_name;
        System.out.println(namereal.charAt(3));
        
        // find all String character by index with loop
        for(int i=0;i<namereal.length();i++){
            
            if(namereal.charAt(i)=='n'){
                System.out.println("at index "+i);
            }
            System.out.print(namereal.charAt(i));
        }
        sc.close();
    }
}
