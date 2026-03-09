package some_basic_concept;

public class Boxing_Unboxing {
    public static void main(String[] args) {

        int i = 10;

        Integer a = new Integer(10);

        Integer a1 = Integer.valueOf(10);   // boxing

        Integer a2 = i;                       // autoboxing

        System.out.println(a.equals(a1));
        System.out.println(a.equals(a2));


        // Unboxing:
        Integer x = 10;
        int y = x;
        System.out.println(y);

        // Auto-Unboxing:
        Integer z = 20;
        int p = z.intValue();
        System.out.println(p);
    }
}
