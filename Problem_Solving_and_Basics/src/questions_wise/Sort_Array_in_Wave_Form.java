package questions_wise;

import java.util.Arrays;

public class Sort_Array_in_Wave_Form {

    private static int[] waveFormUsingSort(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        for(int i = 0; i < n; i += 2){
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }

        return arr;
    }

    private static int[] waveFormSort(int[] arr) {
        int n = arr.length;

        for(int i = 1; i < n - 1; i += 2){
            // left neighbor
            if(arr[i] < arr[i - 1]){
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
            }

            // right neighbor
            if(i + 1 < n && arr[i] < arr[i + 1]){
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        return arr;
    }


    public static void main(String[] args) {
        int arr[] = {3, 6, 5, 10, 7, 20};

        // Question: Sort an array in wave form
        int ans[] =  waveFormUsingSort(arr);
        int ans1[] = waveFormSort(arr);

        System.out.println(Arrays.toString(ans));

        System.out.println(Arrays.toString(ans1));
    }
}
