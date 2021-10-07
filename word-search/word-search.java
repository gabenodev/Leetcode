class Solution {
    
    boolean[][] visited; 
    
    public boolean exist(char[][] board, String word) {
        
        // DFS solution to be implemented 
        
        visited = new boolean[board.length][board[0].length];
        
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
               if (DFS(i,j,0,board,word)){
                   return true;
               }
            }
        }
        
        return false;
        
           }
    
    
    public boolean DFS(int row, int col, int index, char board[][], String word){
            
            /* 3 conditions to be meet
             it is in bound
             it is visited
             not match
            */
        
        if(inBounds(row,col,board) == -1 
           || visited[row][col] 
           || word.charAt(index) != board[row][col] ) {
            return false;
            
        }
        
        // Mark the visited one as true;
        visited[row][col] = true;
            
            
        // Find the whole word
            if(index == word.length()-1){
                return true;
            }
        
        index++;
        
        if(DFS(row+1,col,index,board,word) ||
          DFS(row,col + 1,index,board,word)||
          DFS(row-1,col,index,board,word)  ||  
          DFS(row,col-1,index,board,word)  ){
            return true;
        }
        
        /* current position is wrong, backtracking */
        
        visited[row][col] = false;
        return false;
        
            
        }
    
    
    
    public int inBounds(int row, int col, char[][] board){
        
        if(row == -1 || col == -1 || row == board.length || col == board[0].length){
            return -1;
        }
        return 0;
        
    }
    
}
        
        /* My intuitive solution
        Try to recreate the word from the matrix
        This can be only done if we check if a letter is in the string
        If there is a letter in the given string then we check their neighbours to see if it's also in the word
        Then check if the word has the same letters as the given word
        
        String str = "";
        
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j< board[0].length; j++){
                if(board[i][j] == word.charAt(i)){
                    if(i > 0 && board[i-1][j] == word.charAt(i)){
                        str = str + word.charAt(i);
                    }
                    if(j > 0 && board[i][j-1] == word.charAt(i)){
                          str = str + word.charAt(i);
                    }
                }
            }
        }
        
        
        if(str.equals(word)){
            return true;
        } else
            return false;
            */
        
 