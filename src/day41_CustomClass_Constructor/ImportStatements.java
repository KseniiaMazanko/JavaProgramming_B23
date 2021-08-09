package day41_CustomClass_Constructor;

//import utilities.Data;
import static utilities.Data.str3;
import static utilities.Data.str4;
import static utilities.Data.method3;
//or if we want to import all of them import static utilities.Data.*;

public class ImportStatements {

    /*static import vs regular import

    regular import: imports everything from the class
    import PackageName.className;

    static import: used for importing the static members of the class ONLY
    static import PackageName.className.staticMember;
    static import PackageName.className.*;

     */

    public static void main(String[] args) {

        /* import utilities.Data;
        Data obj = new Data();
        System.out.println(obj.str1);
        System.out.println(obj.str2);


        System.out.println(Data.str3);//static variables are called through the class name
        System.out.println(Data.str4);

         */


        System.out.println("________________________________________");

        // import static we could call the static variable directly

        System.out.println(str3);
        System.out.println(str4);





    }

    /*
    class Data {


    }

     */









}
