package multithreads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

    static final Logger rootLogger = LogManager.getRootLogger();
    static final Logger userLogger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {

        //Testing log4j
        rootLogger.info("Тест");
        userLogger.info("Тест - юзер");

        //Thread
        MyThread testThread = new MyThread();
        testThread.start();

        //Runnable
        MyRunnable testMyRunnable = new MyRunnable();
        Thread nextTestThread = new Thread(testMyRunnable);
        nextTestThread.start();

    }

}
