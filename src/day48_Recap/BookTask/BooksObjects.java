package day48_Recap.BookTask;

public class BooksObjects {

    public static void main(String[] args) {

        Books book1 = new Books("Harry Potter and a secret chamber", "Fantasy", "Joanne Rowling", 30);
        book1.setPrice(40);
        System.out.println(book1.getAuthor());
        System.out.println(book1.getTitle());
        System.out.println(book1);

        EBooks ebook = new EBooks("Nine perfect Strangers", "Mystery", "Liane Moriarty", 17, 200, 200);
        ebook.readBook();
        System.out.println(ebook.getAuthor());
        System.out.println(ebook);


        AudioBook audio = new AudioBook("Rich Dad, Poor Dad", "Scientific", "Robert Kiyosaki", 15.99, 190, "John Linn");
        audio.listen();
    }


}
