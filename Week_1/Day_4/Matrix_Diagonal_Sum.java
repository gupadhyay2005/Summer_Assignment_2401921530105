class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1=0;
        int n = mat.length;
        int i = 0;
        while(i< n){
            sum1+=mat[i][i];
            i++;
        }
         int j = n-1;
        int k = 0;
        int sum2 = 0;
        int x =0;
        while(j>=0 && k<n){
            sum2+=mat[j][k];
            j--;
            k++;
        }
       
        if(n%2!=0){
            return sum1+sum2-mat[n/2][n/2];
        }else{
            return sum1+sum2;
        }
       
    }
}
