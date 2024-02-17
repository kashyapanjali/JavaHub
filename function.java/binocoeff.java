public class binocoeff {
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static int binocoeffi(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int binocoeffi=fact_n/((fact_r )* (fact_nmr));
        return binocoeffi;
    }
    public static void main(String args[]){
        System.out.print(binocoeffi(5,2));
    }
}
