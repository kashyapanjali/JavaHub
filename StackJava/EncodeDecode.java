import java.util.*;
public class EncodeDecode {
     public static String decode(String str){
        Stack<Integer>IntegerStack=new Stack<>();
        Stack<Character>StringStack=new Stack<>();
        String temp="",result="";
        for(int i=0;i<str.length();i++){
            int count=0;
            if(Character.isDigit(str.charAt(i))){
                while(Character.isDigit(str.charAt(i))){
                    count=count*10+str.charAt(i)-'0';
                    i++;
                }
                i--;
                IntegerStack.push(count);
            }
            else if(str.charAt(i)==']'){
                temp="";
                count=0;
                if(!IntegerStack.isEmpty()){
                    count=IntegerStack.peek();
                    IntegerStack.pop();
                }
                while(!StringStack.isEmpty()&&StringStack.peek()!='['){
                    temp=StringStack.peek()+temp;
                    StringStack.pop();
                }
                if(!StringStack.empty()&&StringStack.peek()=='[')
                  StringStack.pop();
                  for(int j=0;j<count;j++){
                    result=result+temp;
                  }
                  for(int j=0;j<result.length();j++)
                    StringStack.push(result.charAt(j));
                    result="";
                  }
                    else if (str.charAt(i) == '['){
                        if (Character.isDigit(str.charAt(i-1)))
                        StringStack.push(str.charAt(i));
                    else{
                        StringStack.push(str.charAt(i));
                        IntegerStack.push(1);
                      }
                    }
                    else
                        StringStack.push(str.charAt(i));
                    }
                    while (!StringStack.isEmpty()){
                        result = StringStack.peek() + result;
                        StringStack.pop();
                    }
                     return result;
                   }
                
                    public static void main(String args[]){
                       String str = "3[b2[ca]]";
                       System.out.println(decode(str));
        
                    }
                    
            }
        
        
     
    

//time complexity O(n)
//space complexity O(n)