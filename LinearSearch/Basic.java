package LinearSearch;

public class Basic {
    public static void main(String[] args) {

        int[] nums =  {44, 55, 76,89, 23, 1, 2};

        int target =1;

        System.out.println(linearSearch(nums, target));
       
    }

    //search in the array and return the index item if found
    //otherwise if not return -1

   static int linearSearch(int[] arr, int target){
          if(arr.length ==0){
            return -1;
          }

          //iterate through each element

          for(int i=0; i<arr.length; i++){
            int element = arr[i];

            if(element == target){
                return i; // return the index of the that element
            }

          }

          return -1;
   }
}


//checking if the 14 is present are not



      
    
