//WAP to find last Occurence of an element in an array.

public class LastOccur {
    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastOcc(arr,key,i+1);
        if(isfound==-1&&arr[i]==key){
            return i;
        }return isfound;
    }
    public static void main(String args[]){
        int arr[]={8,3,6,9,5,10,2,5,3};
        System.out.println(lastOcc(arr,5,0));

    }
    
}
