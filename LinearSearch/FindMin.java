package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 6, 7, 9, 1};

        System.out.println(min(arr));
        
    }

    public static int min(int[] arr){
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
    
}
