/*
 * This program is a tip calculator. Given a bill amount and tip percentage
 * it will calculate the amount of the tip and total bill for you.
 * 
 *
 * SAMPLE RUN: 
 *  Enter Bill Amount : 75
 *  Enter Bill Tip Pct : 0.18
 *
 *  ===== Tip Calc =====
 *  Bill Amount.. 75.000000
 *  Tip Pct...... 0.180000
 *  Tip Amount... 13.500000
 *  Bill Total... 88.500000 
 */

package eztipcalc;

import java.util.Scanner;

public class EZTipCalc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TipCalc tc = new TipCalc();
        System.out.print("Enter Bill Amount : ");
        tc.setBillAmount(input.nextDouble());
        System.out.print("Enter Bill Tip Pct : ");
        tc.setTipPct(input.nextDouble());
        System.out.printf("\n===== Tip Calc =====\n");
        System.out.printf("Bill Amount.. %f\n", tc.getBillAmount());
        System.out.printf("Tip Pct...... %f\n", tc.getTipPct());
        System.out.printf("Tip Amount... %f\n", tc.tipAmount());
        System.out.printf("Bill Total... %f\n", tc.billTotal());
        
    }
}
