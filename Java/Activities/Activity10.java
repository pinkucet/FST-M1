import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("A");
        hs.add("P");
        hs.add("P");
        hs.add("L");
        hs.add("E");


        //Print HashSet
        System.out.println("Original HashSet: " + hs);
        //Print size of HashSet
        System.out.println("Size of HashSet: " + hs.size());


        System.out.println("Removing P from HashSet: " + hs.remove("P"));
        if(hs.remove("B")) {
            System.out.println("B removed from the Set");
        } else {
            System.out.println("B is not present in the Set");
        }

        //Search for element
        System.out.println("Checking if M is present: " + hs.contains("M"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}
