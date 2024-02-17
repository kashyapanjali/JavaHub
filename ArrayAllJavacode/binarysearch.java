public class binarysearch {
    public static int getnumber(int number[],int target){
        int left=0;
        int right=number.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            // if target is equal to target, return index of mid
            if(number[mid]==target){
                return mid;
            }
            else if(number[mid]<target){  //right side 
                left=mid+1;
            }
            else{
                right=mid-1;   //left side
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={11,13,15,17,20};  // sorted array is to be here
        int target=17;
        System.out.println("index of "+ target+" is:"+ getnumber(numbers,target));
    }
}
