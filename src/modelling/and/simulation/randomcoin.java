/*
 * Golden Ogbeka
 */
package modelling.and.simulation;
import java.util.Random;
/**
 *
 * @author Nedlog
 */
public class randomcoin {
    public static void main(String[] args) {
        Random randnum=new Random();
        for (int k = 1; k <= 10; k++) {
            int rnd=randnum.nextInt();
            if (rnd<=0.5) {
                System.out.println("H");
            }
            else{
                System.out.println("T");
            }
        }
    }
}
