public class PatternMain {
    public static void hollow_rectangle(int totrows, int totcols){
        // outer loop
        for(int i=1;i<=totrows;i++){
            //inner loop
              for(int j=1;j<=totcols;j++){
                if(i==1||i==totrows||j==1||j==totcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
              }
              System.out.println();
        }
    }



    public static void invertedPy1(int n){
        // outer loop
        for(int i=1;i<=n;i++){
            //inner loop
          for(int j=1;j<=n-i;j++){
            System.out.print(" ");
          }
          for(int j=1;j<=i;j++){
            System.out.print("*");
          }
          System.out.println();
        }
    }


    public static void pyramidnumber(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //inner loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    public static void floyds_triangle(int n){
        int counter=1;
        //outer loop
       for(int i=1;i<=n;i++){
        //inner loop
        for(int j=1;j<=i;j++){
            //increasing number
            System.out.print(counter+" ");
            counter++;
        }
        System.out.println();
       }
    }


    public static void zeroone_Number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
            
        }
    }


    public static void butterflypattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void hollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
              System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public static void diamondpattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void numberpattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
        System.out.println();
        }
    }


    public static void pallindrom_number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }System.out.println();
        
        }
    }


    public static void main(String args[]){
        hollow_rectangle(4,5);
        invertedPy1(5);
        pyramidnumber(5);
        floyds_triangle(5);
        zeroone_Number(6);
        butterflypattern(8);
        hollowRhombus(5);
        diamondpattern(5);
        numberpattern(6);
        pallindrom_number(6);
    }
    
}
