public class Activity12 {
    public static void main(String[] args) {


        Addable add1 = (a, b) -> (a + b);
        System.out.println("lambda Expression without Return "+add1.add(5, 7));


        Addable add2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println("lambda Expression with Return "+add1.add(35, 89));
    }
}
