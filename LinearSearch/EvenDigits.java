package LinearSearch;

public class EvenDigits {
    
public static void main(String[] args) {
    int[] nums = {12,345,2,6,7896};

    System.out.println(evenDigits(nums));
}


    static int evenDigits(int[] nums){
        int count =0;

       for(int num : nums){
          if(even(num)){
             count++;
          }
       }

        return count;
    }

    //check the number contains the even number or not 

    //steps count the digits

    //conver num to the string

    private static boolean even(int num) {

        int numOfDigits = digits(num);

     /*    if(numOfDigits % 2==0){
            return true;
        }
 */        
        return numOfDigits % 2==0;
    }

    private static int digits(int num){

        if(num <0){
            num = num * -1;
        }
     if(num ==0){
        return 1;
     }

        int count =0;

        while(num >0){
            count++;

            num /=10;
        }

        return count;
    }
}
