package exercises.exercise_03;

import java.util.HashMap;
import java.util.Map;

public class Exercise_03 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Ram", "ram123");
        map.put("Rohit", "rohit2452");

        ILogin l = (username, password) -> {

            if(map.containsKey(username)){

                if(map.get(username).equals(password)){
                    return true;
                }
            }

            return false;
        };

        System.out.println(l.login("Ram", "rohit2452"));
        System.out.println(l.login("Ram", "ram123"));
    }
}
