class Solution {
    public void rotate(int[][] matrix) {
        
        transpose(matrix);
        inverse(matrix);
    }
    
    
    public void transpose(int[][] matrix){
        
        int length = matrix.length;
        for(int i  = 0 ; i < length ; i ++){
            for(int j = i ; j < length ; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
        
    }
    
    
    public void inverse(int[][] matrix){
        
        int n = matrix.length ;
        
        // for each row
        for(int i = 0 ; i < n; i++){
            
            // for each column
            for(int j = 0 ; j < n / 2; j++){
                
                // inverse
                
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
        
        }
        
    }
