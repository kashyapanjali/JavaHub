public class output {
    public static void main(String args[]){
        String str="ShradhaDidi";
        String str1="ApnaCollege";
        String str2= "ShradhaDidi";
        //str2="ShradhaDidi"; immutable concept here
        System.out.println(str.equals(str1)+" "+str.equals(str2));
        System.out.println(str==str2);
        System.out.println(str2.replace("d",""));
    }
    
}
