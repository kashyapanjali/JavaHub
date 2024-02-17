import java.util.Arrays;
public class anagram {
   public static void main(String args[]){

    String str1="race";
    String str2="care";

    //convert Strings to lowercase.why? so that we don't have to check separately for lower and uppercase
    str1 =str1.toLowerCase();
    str2 =str2.toLowerCase();

    //first check if the length are same
    if(str1.length()==str2.length()){

        //convert string into char arrays

        char[] str1CharArray=str1.toCharArray();
        char[] str2CharArray=str2.toCharArray();

        //sort the char array

        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);

       //if the strings char arrays are same or identical then the strings are anagram


       boolean result=Arrays.equals(str1CharArray,str2CharArray);
       if(result){

        System.out.println(str1+" and "+str2+" are anagrams of each other");
       }
       else{
        System.out.println(str1+" and "+str2+" are not anagrams of each other");
       }
       
        }
        else{
        System.out.println(str1+" and "+str2+" are not anagrams of each other");
       }
        
  
   }
    
}
