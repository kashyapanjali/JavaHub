public class substring {
    public static String CutString(String name,int si, int ei){
        String substr="";
        int count=0;
        for(int i=si;i<ei;i++){
            substr+=name.charAt(i);
            count++;

        }
        System.out.println(count);
        return substr;
    }
    public static void main(String args[]){
        
        String name="Aman Chaudhary";

     //through argument
     System.out.println(CutString(name,0,3));

     //through function
     System.out.println(name.substring(0,3));
    }
}
