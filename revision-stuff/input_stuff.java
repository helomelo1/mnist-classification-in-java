import java.util.*;

class input_stuff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();
        // sc.nextLine(); // to clean the input buffer after the nextInt() method. Must be used after every input method except nextLine().

        int age = Integer.parseInt(sc.nextLine()); // alternative to nextInt(). No need to clean the input buffer.
        String name = sc.nextLine();
        // System.out.println("My Age is " + age + ".");
        System.out.printf("My name is %s. My age is %d.", name, age);

        sc.close();
    }
}
