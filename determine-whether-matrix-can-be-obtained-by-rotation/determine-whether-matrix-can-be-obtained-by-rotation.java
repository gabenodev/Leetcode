class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
       for (int i = 0; i < 4; ++i) { // rotate 0, 1, 2, 3 times.
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
        
    }
    
    
    public void rotate(int[][] mat){
        
         
            for(int i = 0 ; i < mat.length ; i++){
                for(int j = i ; j < mat.length; j++){
                    int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        
        
        int n = mat.length;
        
        for(int l = 0 ; l<n;l++){
            for(int k = 0 ; k<n/2 ;k++){
                
                int tmp = mat[l][k];
                mat[l][k] = mat[l][n-k-1];
                mat[l][n-k-1] = tmp;
                
            }
        }
             
    }
    
}