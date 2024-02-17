//time complexity :O(n)
//space complexity:(1)
import java.util.*;
 class UnixStyleString{

     static String simplify(String str){
        Stack<String>s=new Stack<>();
        String res="";
        res+="/";
        int length=str.length();
        for(int i=0;i<length;i++){
            String dir="";
            while(i<length&&str.charAt(i)=='/')
                i++;
                while(i<length&&str.charAt(i)!='/'){
                    dir+=str.charAt(i);
                    i++;
                }
                if(dir.equals("..")){
                    if(!s.isEmpty()){
                        s.pop();
                    }
                   }
                    else if(dir.equals(".")){
                        continue;
                    }
                    else if(dir.length()!=0){
                        s.push(dir);
                    }
                }
                Stack<String>s1=new Stack<>();
                while(!s.isEmpty()){
                    s1.push(s.pop());
                }
                while(!s1.isEmpty()){
                    if(s1.size()!=1){
                        res+=(s1.pop()+"/");
                    }
                        else{
                            res+=s1.pop();
                        } 
                    }
                    return res;
                }

                
        
    
    public static void main(String args[]){
        String str=new String("/a/./b/../../c");
        String res=simplify(str);
        System.out.println("final output is:"+res);
    }
}


