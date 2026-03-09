package questions_wise;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Sort_Stack {

    public static String sort(int arr[], int n){
        Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();
        st.push(arr[0]);

        for(int i=1;i<n;i++){
            if(st.peek() < arr[i]){
                list.add(st.pop());
                st.push(arr[i]);
            }else{
                st.push(arr[i]);
            }
        }

        // stack rest elements
        while (!st.isEmpty()) {
            list.add(st.pop());
        }

        if(isSorted(list)){
            return "Yes";
        }else{
            return "No";
        }
    }

    private static boolean isSorted(List<Integer> list){
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 3};
        int arr1[] = {1, 3, 4, 2};
        int n = arr.length;

        System.out.println(sort(arr1, n));
    }
}
