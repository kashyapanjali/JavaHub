import java.util.Arrays;
public class MaxLongestchain {
    public static int longestchain(int pairs[][],int i,int p,int dp[][]){
        int n=pairs.length;
        if(i>=n){
            return 0;
        }

        if(p!=-1&&dp[i][p]!=-1){
            return dp[i][p];
        }
        int take=0;
        if(p==-1||pairs[i][0]>pairs[p][1]){
          take=1+longestchain(pairs,i+1,i,dp);
        }
        int skip=longestchain(pairs,i+1,p,dp);
        int result=Math.max(take,skip);

        if(p!=-1){
           dp[p][i] = result;
        }
        return result;

    }
    public static void main(String args[]){
        int pairs[][]={{1,2},{7,8},{4,5}};
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[0], b[0]));       
        int n=pairs.length;
        int dp[][]=new int [n+1][n+1];
        for (int row[]:dp) {
            Arrays.fill(row, -1);
            
        }
        System.out.println(longestchain(pairs, 0, -1, dp)); 

    }
    
}
