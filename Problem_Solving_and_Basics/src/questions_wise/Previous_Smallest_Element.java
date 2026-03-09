package questions_wise;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Previous_Smallest_Element {

    public static List<Integer> previousSmallest(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int num : arr) {
            if (st.isEmpty()) {
                list.add(-1);
            } else {
                while (!st.isEmpty() && st.peek() > num) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    list.add(-1);
                } else {
                    list.add(st.peek());
                }
            }

            st.push(num);
        }

        return list;
    }


    public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10, 8};
        int arr1[] = {3, 2, 1};
        int arr2[] = {1, 2, 3, 4};

        System.out.println(previousSmallest(arr));
        System.out.println(previousSmallest(arr1));
        System.out.println(previousSmallest(arr2));

    }
}
