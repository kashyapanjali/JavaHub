public class Large {
        public static void main(String args[]){
    
            String fruits[]={"Mango","Banana","Litchi","Apple","Watermelon"};
            String largest=fruits[0];
            for(int i=0;i<fruits.length;i++){
                if(largest.compareTo(fruits[i])<0){
                    largest=fruits[i];
                }
            }
            System.out.println(largest);
            //time complexity here is T(n)=O(x*N) n is the term and x is the compare to define 
        }
    }
    


    