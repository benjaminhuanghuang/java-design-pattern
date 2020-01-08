
package ben.study.designpattern.creational.singleton.multithread;


public class PrintSpooler2 {
    /**

     */
    private static final  PrintSpooler2 spooler = new PrintSpooler2();

    private static boolean initialized = false;

    /*
        Using private constructor
     */
    private PrintSpooler2() {
    }

    private void init() {
        // Code to initialize our print spooler goes here
    }

    /**
        Add synchronized to getInstance method
     */
    public static synchronized PrintSpooler2 getInstance() {

        if (initialized) return spooler;
        spooler.init();
        initialized = true;
        return spooler;
    }
}
