package questions_wise;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Alice_Game_Play {

    public static String gamePlay(String s){
        Deque<Character> q = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            q.offer(ch);
        }

        LinkedList<Character> l = new LinkedList<>();
        boolean isAlice = true;

        while(!q.isEmpty()){
            char ch;
            if(isAlice){
                ch = q.removeFirst();
                if(ch == '0'){
                    l.addFirst(ch);
                }else{
                    l.addLast(ch);
                }
            }
            else {
                ch = q.removeLast();
                if (ch == '0') {
                    l.addLast(ch);
                } else {
                    l.addFirst(ch);
                }
            }
            isAlice = !isAlice;
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : l){
            sb.append(ch);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String s = "010111";
        String s1 = "1110000010";

        System.out.println(gamePlay(s));
        System.out.println(gamePlay(s1));

    }
}
