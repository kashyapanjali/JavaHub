import java.util.*;
public class linearsearch {
    public static int search(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i].equals(key))
            return i;
        }
        return -1;
    }
    public static int getlargest(int numbers[]){
        int largest=Integer.MIN_VALUE;  // minus infinity is largest value we considered.
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }  return largest;
    }
    //reverse of an array
    public static void reverse(int arr[]){
        int start=0, end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //String menu[]={"samosa","dosa","idali","maggie"};
        
        int size=sc.nextInt();
        String menu[]=new String[size];
        for(int i=0;i<size;i++){
            menu[i]=sc.next();
        }

        for(int i=0;i<menu.length;i++){
            System.out.println(menu[i]);
        }
        System.out.println("enter your key item");

        //linear search of string
        String key=sc.next();
        int index=search(menu,key);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found,at index:"+index);
        }

        // largest number is found
        int numbers[]={2,6,3,7,8};
        System.out.println("largest is "+getlargest(numbers));

        int reverse_num[]={1,2,3,4,5};
        reverse(reverse_num);
        sc.close();
        
    }

}
