package LinearSearch;


//Leetcode problem 
/*
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 */
public class Sqrt {
   public int mySqrt(int x) {
        // for special case when x is 0 and x is 1 return x;

        if(x==1 || x == 0){
            return x;
        }
        //we need to initialize the range values between all
        int start = 1;
        int end = x;
        int mid =-1;

        //use binary search and iterate througth start and end;

        while(start <= end){
            //calculate the mid value using the forlmula start + (end-start) /2;

            mid = start + (end - start) /2;

            if( (mid*mid) > x){
                // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
                end = mid-1;
            }  else if( (mid* mid) == x){
                // If the square of the middle value is equal to x, we found the square root.
                return mid;
            }
           else{
         // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
            start = mid +1;
        }
    }

        return Math.round(end);
      }
    
    
}
