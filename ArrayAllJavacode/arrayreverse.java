public class arrayreverse {
    public static void reverse(int number[]){
        int first=0,last=number.length-1;
        while(first<last){
            int temp=number[first];
            number[first]=number[last];
            number[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[]){
        int numbers[]={4,1,6,5,9,8,10};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
         System.out.print("  "+numbers[i]);
        }
        System.out.println();
    }
}
