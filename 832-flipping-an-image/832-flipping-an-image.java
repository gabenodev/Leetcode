class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i = 0 ; i < image.length ; i++){
                int left = 0;
                int right = image[0].length-1;
                while(right > left){
                    int temp = image[i][left];
                    image[i][left] = image[i][right];
                    image[i][right] = temp;
                    left++;
                    right--;
              }
       
        }
        
         for(int i = 0 ; i < image.length; i++){
                for(int j = 0; j< image[0].length; j++){
                   image[i][j] = (image[i][j]==0)?1:0;
                }
            }
        
        return image;
    }
}