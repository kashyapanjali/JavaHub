public class Simple {
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    
    public static void main(String args[]){
        int numbers[]={25,27,28,34};
        update(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
        
    }
    
}
