import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Rum");
        myList.add("Whiskey");
        myList.add("Brandy");
        myList.add("Vodka");
        //Adding object at specific index
        myList.add(2, "Gin");
        myList.add(4, "Tequila");

        System.out.println("Print All the Objects from ArrayList:");
        for(String s:myList){
            System.out.println(s);
        }

        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is Scotch is in list: " + myList.contains("Scotch"));
        System.out.println("Size of ArrayList: " + myList.size());

        myList.remove("Gin");

        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
