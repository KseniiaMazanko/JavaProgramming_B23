package day48_Recap.BookTask;

public class EBooks extends Books {

    /*
    2. create the following sub classes of Book:
			1. EBook:
					private variables:
						size, pages (final)

					Encapsulate all the fields

					methods:readBook(), toString()
     */

    private int size;
    private final int pages;

    public EBooks(String title, String type, String author, double price, int size, int pages) {
        super(title, type, author, price);
        setSize(size);
        this.pages = pages;
    }

    public int getSize() {
        return size;
    }

    public int getPages() {
        return pages;
    }

    public void setSize(int size) {
        if(size<0){
            return;
        }
        this.size = size;
    }

    public void readBook(){
        System.out.println("You are reading " + getTitle() + " by " + getAuthor() );
    }

    @Override
    public String toString() {
        return "EBooks{" +
                super.toString()+
                ", size=" + size +
                ", pages=" + pages +
                '}';
    }
}
