package testinc1000;

/**
 *
 * @author mannone.mario
 */
public class TestInc1000 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inc1000 t1 = new Inc1000();
        Inc1000 t2 = new Inc1000();
        t1.start();
        t2.start();

        System.out.println(Inc1000.count);
    }

}
