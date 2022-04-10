import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> color = new HashMap<Integer, String>();
        color.put(1, "Red");
        color.put(2, "Orange");
        color.put(3, "Cyan");
        color.put(4, "White");
        color.put(5, "Pink");


        System.out.println("The Original map values " + color);

        color.remove(2);

        System.out.println("After removing Orange: " + color);

        // Check if green exists
        if(color.containsValue("White")) {
            System.out.println("White exists in the Map");
        } else {
            System.out.println("White does not exist in the Map");
        }


        System.out.println("Number of pairs in the Map is: " + color.size());
    }
}