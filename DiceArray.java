import java.util.Scanner;
import java.util.Random;

public class DiceArray {
    
    public static void CountRolls(int rTotal, int[]numY){
     for (int j = 2; j <= 12; ++j) {
                    if (rTotal == j) {
                        ++numY[j];
                    }
                }

    }
    public static void main(String args[]) {

        Scanner scnr = new Scanner(System.in);
        Random randGen = new Random();
        int numRolls = 1; 
        while (numRolls >= 1) {
            int i = 0;
            int[] numY = new int[13];
            int dice1 = 0; 
            int dice2 = 0; 
            int rTotal = 0; // Sum of dice values


            System.out.println(" Number of rolls: ");
            numRolls = scnr.nextInt();


            // Roll dice numRoll times
            for (i = 0; i < numRolls; ++i) {
                dice1 = randGen.nextInt(6) + 1;
                dice2 = randGen.nextInt(6) + 1;
                rTotal = dice1 + dice2;

               

               //method stuffs go here k den
CountRolls(rTotal,numY);

                System.out.println("Roll " + (i + 1) + " is " +
                    rTotal + " (" + dice1 +
                    "+" + dice2 + ")");
            }

            // Print statistics on dice rolls
            if (numRolls >= 1) {
                for (int k = 2; k <= 12; ++k) {
                    System.out.println(k + "s: " + numY[k]);
                }

                for (int m = 2; m <= 12; ++m) {
                    System.out.print(m + "s: ");
                    for (int n = 1; n <= numY[m]; ++n) {
                        System.out.print("*");
                    }

                    System.out.println();
                }
            }
        }


        return;


    }
}