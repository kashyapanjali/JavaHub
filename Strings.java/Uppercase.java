public class Uppercase {
    public static String toUppercase(String str){

        //use string builder function
        StringBuilder sb=new StringBuilder("");

        //start from begin character
        char ch=Character.toUpperCase(str.charAt(0));

        //add to character
        sb.append(ch);

        for(int i=1;i<str.length();i++){

            //check space and iterate next to it
            if(str.charAt(i)==' '&& i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str="hello java! i am anjali kashyap";
        System.out.println(toUppercase(str));
        //time complexity is big ohf n

    }
    
}
