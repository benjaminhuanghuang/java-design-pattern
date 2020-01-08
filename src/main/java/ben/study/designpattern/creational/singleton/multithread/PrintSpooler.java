
package ben.study.designpattern.creational.singleton.multithread;


public class PrintSpooler {

    private static PrintSpooler spooler;

    private static boolean initialized = false;

    /*
        Using private constructor
     */
    private PrintSpooler() {
    }

    private void init() {
        // Code to initialize our print spooler goes here
    }

    /**
        Add synchronized to getInstance method
     */
    public static synchronized  PrintSpooler getInstance() {

        if (initialized) return spooler;
        spooler = new PrintSpooler();
        spooler.init();
        initialized = true;
        return spooler;
    }
}
