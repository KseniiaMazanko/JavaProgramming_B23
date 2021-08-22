package day47_Recap.BrowserTask;

public class BrowserObjects {

    public static void main(String[] args) {

        Chrome chrome = new Chrome();
        chrome.open();

        FireFox fireFox = new FireFox();
        fireFox.close();

        Edge edge = new Edge();
        edge.open();
        edge.close();

        Opera opera = new Opera();
        opera.refresh();
        opera.open();


    }


}
