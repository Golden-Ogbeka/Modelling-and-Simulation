/*
 * Golden Ogbeka
 */
package modelling.and.simulation;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Ogbeka Golden
 */
public class ramdomDie {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String reply;
        do{
        Random randnum=new Random();
        int D1=1+randnum.nextInt(6);
        int D2=1+randnum.nextInt(6);
        int TOTAL=D1+D2;
        System.out.println("Die 1:"+D1+" Die 2:"+D2);
        System.out.println("TOTAL:"+TOTAL);
        System.out.println("Toss Again (Y/N)?");
        reply=input.next();
        } while(reply.equalsIgnoreCase("Y"));
        
       
    
    }
    
}
