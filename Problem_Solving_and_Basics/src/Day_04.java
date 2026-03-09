public class Day_04 {

    // Question 1: Check String is Palindrome or not
    public static boolean isPalindrome(String str){
        int i = 0, j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }


    // Question 2: remove the duplicate characters from the string
    public static String removeDuplicate(String str){
        boolean arr[] = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(arr[ch - 'a'] == false){
                sb.append(ch);
                arr[ch - 'a'] = true;
            }
        }
        return sb.toString();
    }


    // Question 3: Convert the first letter of each word in the string to uppercase (without using toUpperCase() function)
    public static String convertFirstLetterToUpperCase(String str){
        String words[] = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            char ch = word.charAt(0);
            char capital = (char)(ch - 32);
            sb.append(capital);
            sb.append(word.substring(1)).append(" ");
        }

        return sb.toString();
    }


    // Question 4: Swap the words in the string
    public static String swapWordsInString(String str){
        String words[] = str.split(" ");
        int i = 0, j = words.length - 1;

        while( i < j){
            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }

        return String.join(" ", words);
    }


    // Question 5: Write all permutation of a string
    public static void permutation(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans + " ");
            return;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i+1);
            permutation(ros, ans + ch);
        }
    }


    // Question 15: Remove the first occurrence of a specified character from a string
    public static String removeFirstOccurrence(String str, char ch){
        StringBuilder sb = new StringBuilder();
        boolean removed = false;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == ch && !removed){
                removed = true;
                continue;
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }


    // Question 16: Replace a given character with another character in a string
    public static String replaceCharacter(String str, char ch1, char ch2){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch  = str.charAt(i);
            if(ch == ch1){
                sb.append(ch2);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }


    // Question 17: Add a specified character at the given index of a string
    public static String addCharAtPos(String str, char ch, int pos){
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(i == pos){
                sb.append(ch);
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }


    // Question 18: Reverse each word in a given string
    public static String reverseWord(String s){
        String strArr[] = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (String word : strArr) {
            int i = 0;
            int j = word.length() - 1;

            char ch[] = word.toCharArray();

            while(i < j){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }

            ans.append(ch);
            ans.append(" ");
        }

        return ans.toString().trim();
    }


    public static void main(String[] args) {
        // String str = "madam";

        // System.out.println("Is Palindrome: " + isPalindrome(str));
        // System.out.println("Remove Duplicate: " + removeDuplicate(str));
        // System.out.println("Convert First Letter To Upper Case: " + convertFirstLetterToUpperCase("Rohit is better than John"));
        // System.out.println("Swap the words in the string: " + swapWordsInString("Rohit is better than John"));

        // System.out.println("Permutation of a string: ");
        // permutation("abc", "");

        // String s = "abcdebdeadcebce";
        // System.out.println("\nRemove the first occurrence of a specified character from a string: " + removeFirstOccurrence(s, 'e'));

        // System.out.println("Replace a given character with another character in a string: " + replaceCharacter("hello", 'l', 'm'));

        // System.out.println("Add a specified character at the given index of a string: " + addCharAtPos("hello", 'a', 2));

        System.out.println("Reverse each word of the string: " + reverseWord("Hello World!"));
    }
}
