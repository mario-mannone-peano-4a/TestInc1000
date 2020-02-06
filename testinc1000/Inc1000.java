package testinc1000;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mannone.mario
 */
public class Inc1000 extends Thread {

    static int count = 0;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            count++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Inc1000.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
