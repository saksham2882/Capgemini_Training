public class Day_03_a {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        // Question 1: Find the sum of all given elements from an int array
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("The sum of all elements is: " + sum);


        // Question 2: Find the minimum Element from the given array
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            min = Math.min(min, arr[i]);
        }
        System.out.println("The minimum element is: " + min);


        // Question 3: Find the maximum element from the given array
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println("The maximum element is: " + max);


        // Question 4: Find the second max element from the given array
        int firstMax = arr[0];
        int secondMax = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > firstMax){
                secondMax = firstMax;
                firstMax = arr[i];
            }
            else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println("The second maximum element is: " + secondMax);


        // Question 6: Find the average value of an int array
        int avg = sum / arr.length;
        System.out.println("The average value of the array is: " + avg);


        // Question 7: Find out the sum of all even indexed elements from the given array
        int evenSum = 0;
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0){
                evenSum += arr[i];
            }
        }
        System.out.println("The sum of all even indexed elements is: " + evenSum);


        // Question 8: Find out the sum of all odd indexed elements from the given array
        int oddSum = 0;
        for(int i=0; i<arr.length; i++){
            if(i % 2 != 0){
                oddSum += arr[i];
            }
        }
        System.out.println("The sum of all odd indexed elements is: " + oddSum);


        // Question 9: Find out the min value from all even indexed elements from the given array
        int minVal = arr[0];
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0){
                minVal = Math.min(minVal, arr[i]);
            }
        }
        System.out.println("The minimum value from all even indexed elements is: " + minVal);


        // Question 10: Find out the max value from all odd indexed elements from the given array
        int maxVal = arr[0];
        for(int i=0; i<arr.length; i++){
            if(i % 2 != 0){
                maxVal = Math.max(maxVal, arr[i]);
            }
        }
        System.out.println("The maximum value from all odd indexed elements is: " + maxVal);


        // Question 11: Find out the avg value from all even indexed elements from the array
        int evenCount = 0;
        int evenIdxSum = 0;
        for(int i=0; i<arr.length; i++){
            if(i % 2 == 0){
                evenCount++;
                evenIdxSum += arr[i];
            }
        }
        int avgEven = evenIdxSum / evenCount;
        System.out.println("The average value from all even indexed elements is: " + avgEven);


        // Question 12: Find out the avg value from all odd indexed elements from the given array
        int oddCount = 0;
        int oddIdxSum = 0;
        for(int i=0; i<arr.length; i++){
            if(i % 2 != 0){
                oddCount++;
                oddIdxSum += arr[i];
            }
        }
        int avgOdd = oddIdxSum / oddCount;
        System.out.println("The average value from all odd indexed elements is: " + avgOdd);


        // Question 13: Find out the sum of all elements from a first half of given int array
        int firstHalfSum = 0;
        for(int i=0; i<arr.length/2; i++){
            firstHalfSum += arr[i];
        }
        System.out.println("The sum of all elements from a first half of given int array is: " + firstHalfSum);


        // Question 14: Find out the sum of all elements from a second half of given int array
        int secondHalfSum = 0;
        for(int i=arr.length/2; i<arr.length; i++){
            secondHalfSum += arr[i];
        }
        System.out.println("The sum of all elements from a second half of given int array is: " + secondHalfSum);


        // Question 15: Find out the min value from a first half of given int array
        int minValFirstHalf = 0;
        for(int i=0; i<arr.length/2; i++){
            minValFirstHalf = Math.min(minValFirstHalf, arr[i]);
        }
        System.out.println("The min value from a first half of given int array is: " + minValFirstHalf);


        // Question 16: Find out the min value from a second half of given int array
        int minValSecondHalf = 0;
        for(int i=arr.length/2; i<arr.length; i++){
            minValSecondHalf = Math.min(minValSecondHalf, arr[i]);
        }
        System.out.println("The min value from a second half of given int array is: " + minValSecondHalf);


        // Question 17: Find out the max value from a first half of given int array
        int maxValFirstHalf = 0;
        for(int i=0; i<arr.length/2; i++){
            maxValFirstHalf = Math.max(maxValFirstHalf, arr[i]);
        }
        System.out.println("The max value from a first half of given int array is: " + maxValFirstHalf);


        // Question 18: Find out the max value from a second half of given int array
        int maxValSecondHalf = 0;
        for(int i=arr.length/2; i<arr.length; i++){
            maxValSecondHalf = Math.max(maxValSecondHalf, arr[i]);
        }
        System.out.println("The max value from a second half of given int array is: " + maxValSecondHalf);

    }
}
