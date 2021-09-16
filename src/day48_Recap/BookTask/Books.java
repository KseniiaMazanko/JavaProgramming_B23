package day48_Recap.BookTask;

public class Books {

    /*
    Book Task:
	1. create a class Called Book:
			private variables:
				title(final), type(final), author(final), price

			Encapsulate all the fields

			Add a constructor that can set all the fileds when an object is created

			methods: toString()

     */

        private final String title;
        private final String type;
        private final String author;
        private double price;
        static int num3 = 400;

        public String getTitle(){
            return title;
        }

        public String getType(){
            return type;
        }

        public String getAuthor(){
            return author;
        }

        public double getPrice(){
            return price;
        }

    public void setPrice(double price) {
            if(price<0){
                return;
            }
        this.price = price;
    }

    public Books(String title, String type, String author, double price) {
        this.title = title;
        this.type = type;
        this.author = author;
        setPrice(price);
    }

    @Override
    public String toString() {
        return
                "title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price;
    }
}
