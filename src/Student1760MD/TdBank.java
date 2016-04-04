/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student1760MD;

/**
 *
 * @author DHAYMANE
 */
public class TdBank {
    public static void main(String[] args) {
     int lift[][] = new int[8][7];
     int m, h, n = 0;
     for(m=0; m<8; m++)
         for(h=0; h<7; h++){
             lift[m][h]= n;
             n++;
         }
     for(m=0; m<8; m++){
         for(h=0; h<7; h++)
             System.out.print(lift[m][h] + " ");
             System.out.println();
     }
    }
}
