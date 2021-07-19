package day16_StringMethods;

public class WebName {

    public static void main(String[] args) {

        String url = "www.amazon.com";

        String name = url.substring(url.indexOf(".")+1, url.lastIndexOf("."));

        System.out.println(name);

        String domain = url.substring(url.lastIndexOf(".")+1);//+1 excludes dot
        System.out.println(domain);





    }


}
