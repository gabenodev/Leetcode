class Solution {
    public int diagonalSum(int[][] mat) {
        
        int sum = 0;
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[0].length;j++){
                if(i==j) sum += mat[i][j];
                 if(i+j == mat.length - 1) sum += mat[i][j]; 
                
            
            }
        }
        
        int size = mat.length;
        if(mat.length % 2 == 1){
            sum -= mat[size/2][size/2];
        }
        
      return sum;  
    }
}