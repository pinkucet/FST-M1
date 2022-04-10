public abstract class Book {
    public String title;
    public abstract void setTitle(String t);
    public void getTitle(){
        System.out.println("Title of the book is: "+title);
    }

}
