package day48_Recap.BookTask;

public class AudioBook extends Books {

    /*
    2. AudioBook
					private variables:
						length, narrator(final)

					Encapsulate all the fields

					methods: listen(), toString()

     */

    private int length;
    private final String narrator;

    public AudioBook(String title, String type, String author, double price, int length, String narrator) {
        super(title, type, author, price);
        setLength(length);
        this.narrator = narrator;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length<0){
            return;
        }
        this.length = length;
    }

    public String getNarrator() {
        return narrator;
    }

    public void listen(){
        System.out.println("You are listening " + getTitle() + " read by " + narrator);
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                super.toString()+
                ", length=" + length +
                ", narrator='" + narrator + '\'' +
                '}';
    }
}
