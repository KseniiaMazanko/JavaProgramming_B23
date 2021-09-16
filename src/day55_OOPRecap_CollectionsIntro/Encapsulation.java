package day55_OOPRecap_CollectionsIntro;

public class Encapsulation {

    private String bookName;

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        if(bookName.isEmpty()){
            throw new RuntimeException("Book name can not be empty");
        }
        this.bookName=bookName;
    }



}

class Test{

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();

        obj.setBookName("");//setting a book name to an empty string so we could see the custom exception
        System.out.println(obj.getBookName());

    }

}
