package Oops;

class Pen {
    String color;
    String type;

    // Functions declared within class is known as methods
    // these are methods of pen class >
    public void write() {
        System.out.println("This pen is writing! \n" + "Colour is :" + color + "\nType is :" + type);
    }

    // this keyword is
    public void printcolor() {
        System.out.println(this.color + "\n" + this.type);
    }
}

public class ClassAndObjects {
    public static void main(String[] args) {
        // Objects of Pen class >
        Pen pen1 = new Pen();
        pen1.color = "black";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "White";
        pen2.type = "boll";
        pen2.printcolor();
    }
}