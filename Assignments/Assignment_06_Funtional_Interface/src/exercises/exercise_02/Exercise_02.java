package exercises.exercise_02;

public class Exercise_02 {

    public static void main(String[] args) {

        IFormatString f = (str) -> {

            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                sb.append(" ");
            }

            return sb.toString();
        };

        System.out.println(f.format("CAPGEMINI"));
    }
}
