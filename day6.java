import java.util.Arrays;
public class day6{
    // public static void bubblesort(int[] arr){
    //     int n =arr.length;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=0;j<n-1;j++){
    //             if(arr[j] > arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

    // public static void bubblesortdecreasing(int[] arr){
    //     int n =arr.length;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=0;j<n-i-1;j++){
    //             if(arr[j] < arr[j+1]){
    //                 int temp = arr[j];
    //                 arr[j] = arr[j+1];
    //                 arr[j+1] = temp;
    //             }
    //         }
    //     }
    // }

    // public static void main(String[] args){
    //     System.out.println("Start small Ship Something.");
    //     int[] arr = {5,3,8,4,2};
    //     // bubblesort(arr);
    //     bubblesortdecreasing(arr);
    //     System.out.println(Arrays.toString(arr));
    // }



    // ************* Selection Sort **********************

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] >arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args){
        int[] arr = {4,3,5,8,2};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}