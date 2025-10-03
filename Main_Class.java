class Main_Class{
    static int age; // default value is 0
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        // int age = 23; // will work since this is local to the main() method
        // System.out.println("My age is " + age + ".");

        // double a = 6.9;
        // int b = (int)a;

        // System.out.println(b);

        String name = "John Doe";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace("Doe", "Smith"));
        System.out.println(name);
    }
}