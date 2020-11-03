/*
 * Golden Ogbeka
 */
package modelling.and.simulation;
import java.util.Random;
/**
 *
 * @author Nedlog
 */
public class randomnum {
    public static void main(String[] args) {
        Random randnum=new Random();
        int x;
        for (int i = 1; i <= 30; i++) {
            //between p and n p+randnum.nextInt(n+(1-p))
            x=20+randnum.nextInt(31);
            System.out.println(x);
        }
    }
}
