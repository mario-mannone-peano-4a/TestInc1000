package testinc1000_2;




/**
 *
 * @author mannone.mario
 */
public class TestInc1000_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
       Inc1000_2 t1=new Inc1000_2();
       Inc1000_2 t2=new Inc1000_2();
       t1.start();
       t2.start();
       t1.join();
       t2.join();
       System.out.println(Inc1000_2.count);
    }
    
}
