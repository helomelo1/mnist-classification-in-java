import java.util.HashMap;

public class hash {
    public static void main(String[] args) {
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(5, 10);
        m.put(1, 3);
        m.put(8, 5);

        // m.getOrDefault(1, 0);
        System.out.println(m.getOrDefault(455, 0));
        System.out.println(m.getOrDefault(1, 0));

        System.out.println(m.toString());
        System.out.println(m.size());
    }
}
