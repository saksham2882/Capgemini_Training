import java.util.Scanner;

public class Day_03 {
    public static void main(String[] args) {
        // Problem solving

        // ------------- Question 1 -------------
        // WAP to print the ASCII value
        // for(int i = 0; i < 256; i++) {
        //     System.out.println(i + " : " + (char)i);
        // }

        // ============== Arrays ==============
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is: ");
        for(int i=0; i<n; i++){
            System.out.println("Num: " + arr[i]);
        }

        sc.close();
    }
}
