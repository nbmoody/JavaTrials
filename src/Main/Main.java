package Main;// Author: Nathaniel Ben. Moody
// Initial Date: 10/1/2017
// Filename: Main.java
// Project: JavaTrials


// Imports:
import Threads.TryUnsynchronizedThread;
import Threads.TrySynchronizedThread;

public class Main {

    public static void main(String[] args) {
        TrySynchronizedThread job = new TrySynchronizedThread();
        Thread alpha = new Thread(job);
        Thread beta = new Thread(job);
        alpha.setName("alphaSync");
        beta.setName("betaSync");

        alpha.start();
        beta.start();
    }


}//end of head class
