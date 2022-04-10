public class Activity8 {
    public static void main(String[] args){
        try {

            Activity8.userDefinedException("This is a valid message");
            Activity8.userDefinedException(null);
        } catch(CustomException ce) {
            System.out.println("Inside catch block: " + ce.getMessage());
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    static void userDefinedException(String msg) throws CustomException {
        if(msg==null) {
            throw new CustomException("String is null");
        } else {
            System.out.println(msg);
        }
    }
}
