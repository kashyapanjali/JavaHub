//Remove duplicate in a String "appnnacollege"
public class RemoveDup {
    public static void removeDuplicate(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }

        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            //duplicate
            removeDuplicate(str,idx+1,newStr,map);
        }
        else{
            map[currchar-'a']=true;
            removeDuplicate(str, idx, newStr.append(currchar), map);
        }
    }
    public static void main(String args[]){
        String str="appnnacollege";
        removeDuplicate(str, 0, new StringBuilder(""), new boolean[26]);

    }
    
}
