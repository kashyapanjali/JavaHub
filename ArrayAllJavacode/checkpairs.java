public class checkpairs {

    // print pairs of array
    public static void pairs(int arr[]){
        //total number of pairs
        int tp=0;
        for(int i=0;i<arr.length;i++){
            int current=arr[i];
            for(int j=i+1;j<arr.length;j++){
             System.out.print("("+current+","+arr[j]+")");
             tp++;
            }
            System.out.println();
        }
        // total subarray print
        System.out.println("total subarray is:"+tp);
        System.out.println();
    }

    public static void printsubarray(int arr[]){

        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){

               int sum=0;

                for(int k=i;k<=j;k++)//subarray
                {
                    System.out.print(arr[k]+" "); //subarray print
                   
                     sum=sum+arr[k];//sum of subarray
                }
                System.out.println(":sum of subarray is:"+sum);

                //find smallest and largest sum
                if(largest<sum){
                  largest=sum;
                }
                if(smallest>sum){
                    smallest=sum;
                }
            
            }
            System.out.println();
        }
        System.out.println("largest subarray sum is:"+largest);
        System.out.print("smallest subarray sum is:"+smallest);

    }

    //kadane's Algorithm
    public static void kadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
        }
        System.out.println("\nMaximum subarray sum is:"+ms);
    }

    public static void main(String args[]){
        int numbers[]={2,-3,6,-8,5,3};

        // print pairs of arrays
        pairs(numbers);

        //print subarrays->sum,minsum,maxsum
        printsubarray(numbers);

        kadanes(numbers);
    }
    
}
