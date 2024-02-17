public class getpath {
    public static float getshortestpath(String path){
        int x=0;
        int y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir=='S'){
                y--;
            }
            //north
            else if(dir=='N'){
                y++;
            }
            //east
            else if(dir=='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);

    }
    
    public static void main(String args[]){
        
        String pathForm = "WNSEEWESNNSEEN";
        float originalValue = getshortestpath(pathForm);
        float roundedValue = Math.round(originalValue);
        
        // Convert the float values to strings before printing
        System.out.println("Original Value: " + originalValue);
        System.out.println("Rounded Value: " + roundedValue);
    }
    
}
