/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src20210125;

/**
 *
 * @author Campus FP
 */
public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num1={34,21,7,73,53};
        int[] num2={0,0,0,0,0};
        System.arraycopy(num1, 0, num2, 0, num1.length);
        System.out.println("ARRAY 1:");
        for(int i=0;i<num1.length;i++){
            System.out.println(num1[i]);
        }
        System.out.println("ARRAY 2:");
        for(int i=0;i<num2.length;i++){
            System.out.println(num2[i]);
        }
    }
}
