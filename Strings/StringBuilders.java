package Strings;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sd = new StringBuilder("Vyankatesh");
 
        System.out.println(sd);
        
        // char At function
        System.out.println(sd.charAt(3));

        // set char At function
        sd.setCharAt(3,'Z');
        System.out.println(sd);

        // insert At function
        sd.insert(0, 'I');
        System.out.println(sd);

        // Delete char function

        sd.delete(0, 4);
        System.out.println(sd);

        // append function
        sd.append(" hello");
        System.out.println(sd);
    }
}
