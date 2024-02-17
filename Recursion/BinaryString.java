//Print all biary string of size n without consecutive ones.
public class BinaryString {
    public static void printBinString(int n,int lastplace,String str){
        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        //kaam
        printBinString(n-1,0,str+"0");
        if(lastplace==0){
            printBinString(n-1,1,str+"1");
        }
    }
    public static void main(String args[]){
        printBinString(3,0,"");
    }
    
}
