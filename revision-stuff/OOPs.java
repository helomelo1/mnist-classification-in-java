class Pen {
    String color, type, owner;

    Pen() {}

    public void write() {
        System.out.println("Writing Something!");
    }

    public void tellColor() {
        System.out.println(this.color);
    }
}

class Shape {
    String color;
    public void area() {
        System.out.println("Displays Area: ");
    }
}

class Square extends Shape {
    public void area(int s) {
        System.out.println(s * s);
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

public class OOPs {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "Blue";
        // pen1.type = "Fountain";
        // pen1.owner = "student1";
        
        // pen1.write();
        // pen1.tellColor();
        
        // Pen pen2 = new Pen();
        // pen2.color = "Red";
        // pen2.type = "Gel";
        // pen2.owner = "student2";

        // pen2.write();
        // pen2.tellColor();

        Square s1 = new Square();
        s1.color = "red";
        System.out.println(s1.color);

        s1.area(5);
    }
}
