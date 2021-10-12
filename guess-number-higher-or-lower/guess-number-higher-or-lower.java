/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
        int low = 1;
        int high = n;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0)
                return mid;
            else if (res < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
        
        
        
        /*
        int low = 1;
        int high = n;
        
        // binary search implementation.
        // Time exceeds???
        while(low <= high){
            int mid = low +(low+high)/2;
            int res = guess(mid);
            
            if(res == 0){
                return mid;
            } else if(res < 0){
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return -1;
        */
        
        // The way the problem is formulated is bad...
        // Time limit exceeds
        /*
        for(int i = 0 ; i < n ; i++){
            if(guess(i) == 0)
            return i;
        }
        return n;
        */
    }
}